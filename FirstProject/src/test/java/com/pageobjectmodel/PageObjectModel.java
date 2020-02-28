package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModel extends PageBase{



	public PageObjectModel(WebDriver driver) {
		super(driver);
	}

	
	
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	public WebElement account;
	public WebElement getAccount() {
		return account;
	}
	

	@FindBy(xpath="//a[@id='createAccountSubmit']")
	public WebElement createaccount;
	public WebElement getCreateaccount() {
		return createaccount;
	}
	
	@FindBy(xpath="//input[@id='ap_customer_name']")
	public WebElement fullname;
	public WebElement getFullname() {
		return fullname;
	}
	
	

	@FindBy(xpath="//input[@id='ap_email']")
	public WebElement  email;
	public WebElement getEmail() {
		return email;
	}
	

	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement password;
	public WebElement getPassword() {
		return password;
	}



@FindBy(xpath="//input[@id='ap_password_check']")
public WebElement repassword ;
public WebElement getRepassword() {
	return repassword;
}


@FindBy(xpath="//input[@id='continue']")
public WebElement Continue;
public WebElement getContinue() {
	return Continue;
}

}
