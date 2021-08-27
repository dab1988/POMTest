package com.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.BaseDriver;
import com.qa.pages.customerPage;
import com.qa.pages.loginPage;
import com.qa.utilPackage.FrameWorkutilPack;

import appplicationPagesSteps.addCustomerPage;

public class ADDcustomerTestclass extends BaseDriver
{

	loginPage login;
	
	//https://github.com/naveenanimation20
	@BeforeClass
	void setuP() throws Exception
	{
		BaseUtilDeiver();
		login= new 	loginPage();
		login.login();
		addCustomerPage addCust= new addCustomerPage();
	}
	
	@Test
	void runTest() throws Exception
	{
		addCustomerPage.clickCustomers();
		
		addCustomerPage.createCustomer();
		
		if(addCustomerPage.getPageTitle().equals(pro.getProperty("newCustTitle")))
		{
			Thread.sleep(500);
		    addCustomerPage.addCustomer();
		
		   if(addCustomerPage.getPageTitle().equals(pro.getProperty("addNewCustPageTitle")))
		   {
		addCustomerPage.enterEmail("a123@a.com");
		addCustomerPage.enterPassword("abc@12365");
		addCustomerPage.enterFirstName("reno");
		addCustomerPage.enterLastName("Tree");
		addCustomerPage.gender("Male");
		addCustomerPage.DOB("03/10/1986");
		
		addCustomerPage.selectCompany("Quality");
		
		addCustomerPage.taxExempt("Y");
		FrameWorkutilPack.scrollWindow(driver, customerPage.Managerofvendor);
	//	addCustomerPage.Newsletter();
		Thread.sleep(500);
		addCustomerPage.customerRoles("Administrators");
		
		addCustomerPage.manageVendor("2");
		
		addCustomerPage.adminComment("First Customer Added");
		FrameWorkutilPack.scrollWindow(driver, customerPage.btnsave);
		   }
		//addCustomerPage.clickSave();
		}
	}	
	
	@AfterClass
	void kill() 
	{
		//BaseDriver.closeDriver();	
	}
}