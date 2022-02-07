package com.myproject.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	Properties pro;
	
	
	//Creating constructor to load the properties file
	public ReadPropertiesFile() 
	{
		try {
			FileInputStream fis=new FileInputStream("./Properties//InputData.properties");
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getApplicationURL() //method to read "URL" from properties file
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() //method to read "user name" from properties file
	{
		String uid=pro.getProperty("userName");
		return uid;
	}
	public String getPassWord() //method to read "password" from properties file
	{
		String pwd=pro.getProperty("password");
		return pwd;
	}
	
	
	

}
