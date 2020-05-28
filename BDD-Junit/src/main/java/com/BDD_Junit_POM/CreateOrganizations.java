package com.BDD_Junit_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BDD_Junit_GenericLib.Base;

public class CreateOrganizations 
{
	@FindBy(name="accountname")
	private WebElement organizationNameTF;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBTN;
	
	public CreateOrganizations() 
	{
		PageFactory.initElements(Base.staticDriver, this);
	}

	public WebElement getOrganizationNameTF() 
	{
		return organizationNameTF;
	}
	
	public WebElement getSaveBTN() 
	{
		return saveBTN;
	}
	
	public Organizations createOrganzation(String orgName)
	{
		organizationNameTF.sendKeys(orgName);
		saveBTN.click();
		return new Organizations();
	}
	
	
}
