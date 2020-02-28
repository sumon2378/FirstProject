package com.stefdef;

import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pageobjectmodel.PageObjectModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef  extends Base {
	
	
	PageObjectModel pm;
	
	
	
	
	@Given("^User able to go home page$")
	public void user_able_to_go_home_page() throws Throwable {
	   getDriver();
	  // pm=PageFactory.initElements(driver, PageObjectModel.class);
	   pm= PageFactory.initElements(driver, PageObjectModel.class);
	}

	@When("^User able to click account$")
	public void user_able_to_click_account() throws Throwable {
	   pm.getAccount().click();
	   
	}

	@When("^User able to click start here$")
	public void user_able_to_click_start_here() throws Throwable {
	   pm.getCreateaccount().click();
	   
	}

	@When("^User enter  full name$")
	public void user_enter_full_name() throws Throwable {
	   pm.getFullname().sendKeys("sheiksumon");
	   
	}

	@When("^User enter email address$")
	public void user_enter_email_address() throws Throwable {
	   pm.getEmail().sendKeys("sumonbd64ss@gmail.com");
	   
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
	   pm.getPassword().sendKeys("sumon1765");
	   
	}

	@When("^user re-enter password$")
	public void user_re_enter_password() throws Throwable {
	   pm.getRepassword().sendKeys("sumon1765");
	   
	}

	@When("^user click on create on your amazon account$")
	public void user_click_on_create_on_your_amazon_account() throws Throwable {
	   pm.getContinue().click();
	   
	}

	@Then("^User able to sing up successfully$")
	public void user_able_to_sing_up_successfully() throws Throwable {
	   
	   
	}


}
