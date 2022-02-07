package com.myproject.TestCases;

import org.testng.annotations.Test;

import com.myproject.pageobjects.LoginPage;

public class TC_TestCase_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		logger.info("url opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("username enterer");
		lp.setpassWord(password);
		logger.info("password entered");
		lp.submitLogin();
		logger.info("login btn clicked");
		
		
	}
	

}
