package com.qa.test;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.BaseDriver;
import com.qa.pages.loginPage;
import com.qa.utilPackage.captureScreenShots;

public class loginTest extends BaseDriver
{
 
	loginPage login=null;
	
	@BeforeClass
	public void setUpTest() throws Exception 
	{
		BaseUtilDeiver();
		login= new loginPage();
		login.login();
	}
	
	
	@Test
	void validateTitle()
	{
		Assert.assertEquals(driver.getTitle(), pro.getProperty("homePageTitle"));
		log.info("Login Successful");
	}
	
	@AfterMethod
	void captureFailedTestCase(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			captureScreenShots.screenShot(driver, result.getName());
			log.info("Screen Shot Captured");
		}
		
	}
	
@AfterClass
 void kill()
 {
	BaseDriver.closeDriver();	
 }
	
}
