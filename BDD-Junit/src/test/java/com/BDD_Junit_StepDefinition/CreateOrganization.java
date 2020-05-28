package com.BDD_Junit_StepDefinition;

import com.BDD_Junit_GenericLib.Base;
import com.BDD_Junit_POM.CreateOrganizations;
import com.BDD_Junit_POM.Organizations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateOrganization extends Base
{
	public Organizations org;
	public CreateOrganizations creOrg;
	
	@Given("^user is in login page$")
	public void user_is_in_login_page()  
	{
	   openBrowser();	    
	}

	@Then("^user enters username and password and click on login button$")
	public void user_enters_username_and_password_and_click_on_login_button()  
	{
	   login();
	}

	@Then("^user click on Organization link$")
	public void user_click_on_Organization_link()  
	{
	    org = home.clickOrganizationsLink();	    
	}

	@Then("^user click on Create organization button$")
	public void user_click_on_Create_organization_button()  
	{
	   creOrg = org.clickCreateOrganizationsLink();    
	}

	@Then("^user enters necessary details and click on save button$")
	public void user_enters_necessary_details_and_click_on_save_button()  
	{
	    creOrg.createOrganzation("QSpiders");	    
	}
}
