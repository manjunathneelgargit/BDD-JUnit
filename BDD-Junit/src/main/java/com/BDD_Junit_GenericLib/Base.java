package com.BDD_Junit_GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BDD_Junit_POM.Home;
import com.BDD_Junit_POM.Login;

public class Base 
{
	public WebDriver driver;
	public FileLib flib = new FileLib();
	public WebDriverWait wait;
	public static WebDriver staticDriver;
	public Login lg;
	public Home home;
	
	public void openBrowser()
	{
		if(flib.getPropertyKV("browser").equals("chrome"))
		{
			driver = new ChromeDriver();
			staticDriver = driver;
		}
		else if(flib.getPropertyKV("browser").equals("firefox"))
		{
			driver = new FirefoxDriver();
			staticDriver = driver;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		driver.get(flib.getPropertyKV("url"));
	}
	
	public void login()
	{
		lg = new Login();
		home = lg.loginToApp(flib.getPropertyKV("username"), flib.getPropertyKV("password"));
	}
	
	public void logout()
	{
		home.logout();
	}
		
	public void closeBrowser()
	{
		driver.quit();
	}
}
