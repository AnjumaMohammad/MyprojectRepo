package com.myproject.TestCases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.myproject.utils.ReadPropertiesFile;

public class BaseClass {
	ReadPropertiesFile Readfile=new ReadPropertiesFile();
	 public String baseURL=Readfile.getApplicationURL();
	 public String userName=Readfile.getUserName();
	 public String password=Readfile.getPassWord();
	 public static Logger logger;
	 
	 public static WebDriver driver;
	 @BeforeClass
	 public void setup()
	 {
		 logger=Logger.getLogger("MyProject");
		 PropertyConfigurator.configure("Log4j.properties");
		 System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	 }
	
	 @AfterClass
	 public void teardown()
	 {
		 driver.quit();
	 }
	 
	 

}
