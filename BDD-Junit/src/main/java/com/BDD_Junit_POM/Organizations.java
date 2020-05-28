package com.BDD_Junit_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BDD_Junit_GenericLib.Base;

public class Organizations 
{
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createOrganizationsImg;
	
	
	public Organizations()
	{
		PageFactory.initElements(Base.staticDriver, this);
	}


	public WebElement getCreateOrganizationsImg() {
		return createOrganizationsImg;
	}
	
	public CreateOrganizations clickCreateOrganizationsLink()
	{
		createOrganizationsImg.click();
		return new CreateOrganizations();
	}
}
