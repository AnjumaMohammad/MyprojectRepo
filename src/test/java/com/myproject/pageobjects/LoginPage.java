package com.myproject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="txtUsername")
	WebElement UserName;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement Login;
	
	public void setUserName(String uName)
	{
		UserName.sendKeys(uName);
	}
	public void setpassWord(String pwd)
	{
		Password.sendKeys(pwd);
	}
	public void submitLogin()
	{
		Login.click();
	}
}
