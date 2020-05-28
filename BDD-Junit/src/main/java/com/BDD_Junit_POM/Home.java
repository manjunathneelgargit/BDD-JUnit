package com.BDD_Junit_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BDD_Junit_GenericLib.Base;

public class Home 
{
	@FindBy(linkText = "Organizations")
	private WebElement organizationsLink;
	
	@FindBy(xpath="//img[contains(@src,'user.PNG')]")
	private WebElement userIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement SignOutLink;
		
	public WebElement getUserIcon() {
		return userIcon;
	}


	public WebElement getSignOutLink() {
		return SignOutLink;
	}


	public WebElement getOrganizationsLink() 
	{
		return organizationsLink;
	}
	
	
	public Home()
	{
		PageFactory.initElements(Base.staticDriver, this);
	}
	
	public Organizations clickOrganizationsLink()
	{
		organizationsLink.click();
		return new Organizations();
	}
	
	public Login logout()
	{
		userIcon.click();
		SignOutLink.click();
		return new Login();
	}
	
}
