package com.myproject.TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.myproject.pageobjects.LoginPage;
import com.myproject.utils.XLUtils;

public class TC_LoginTest_DDT_002 extends BaseClass {

	@Test(dataProvider="Logindata")
	public void loginDDT(String uid, String pwd) {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(uid);
		lp.setpassWord(pwd);
		lp.submitLogin();
	}
	
	@DataProvider(name="Logindata")
	String [][] getData() throws IOException{
		String path=System.getProperty("./testData//LoginData.xlsx");
		
		int rowCount=XLUtils.getRowCount(path, "sheet1");
		int cellCount=XLUtils.getCellCount(path, "sheet1", 1);
		String loginData[][]=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				loginData[i-1][j]=XLUtils.getCellData(path, "sheet1", i, j);
			}
		}
		return loginData;
	}
	

}
