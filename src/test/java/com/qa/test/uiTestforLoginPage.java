package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.BaseDriver;
import com.qa.pages.loginPage;

public class uiTestforLoginPage extends BaseDriver
{

loginPage login=null;
	
//org.openqa.selenium.SessionNotCreatedException: session not created exception

	@BeforeClass
	public void setUpTest() throws Exception 
	{
		BaseUtilDeiver();
		login= new loginPage();
		//login.login(pro.getProperty("uname"), pro.getProperty("admin"));
	}
	
	@Test
	 void validateWelcomeText()
	{
		try
		{
			
		Assert.assertEquals(login.welComeText(), pro.getProperty("welComeText"));	
	     log.info("Validation Passed");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	void RememberMeTextValidation()
	{
		try
		{
			Assert.assertEquals(login.remeberMetextLabel(), pro.getProperty("remberMetext"));
			 log.info("Validation Passed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterClass
	void kill()
	{
	  	BaseDriver.closeDriver();
	}
}
