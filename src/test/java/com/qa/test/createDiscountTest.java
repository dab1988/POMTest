package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.BaseDriver;
import com.qa.pages.createDiscountPage;
import com.qa.pages.loginPage;
import com.qa.utilPackage.FrameWorkutilPack;

import appplicationPagesSteps.promotionsPageSteps;

public class createDiscountTest 
{

	@BeforeClass
	void setUp()
	{
		try {
			BaseDriver.BaseUtilDeiver();
			loginPage login= new loginPage();
			promotionsPageSteps promotion = new promotionsPageSteps();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void createDiscount()
	{
		loginPage.login();
		promotionsPageSteps.clickPromotions();
		promotionsPageSteps.clickDiscounts();
		
		Assert.assertEquals(BaseDriver.driver.getTitle(), BaseDriver.pro.getProperty("discountPageTitle"));
		createDiscountPage.clickAddNew.click();
		//FrameWorkutilPack.elementClick(BaseDriver.driver, createDiscountPage.clickAddNew);
		promotionsPageSteps.enterFirstName("Summer Offer Discount Flat 50%");
		
		promotionsPageSteps.selectDiscountType("1");
		promotionsPageSteps.discountAmount("100");
		
		promotionsPageSteps.startDate("8/25/2021 12:00 AM");
		
		promotionsPageSteps.endDate("8/29/2021 12:00 AM");
		
		promotionsPageSteps.discoutLimit("1");
		
		FrameWorkutilPack.scrollWindow(BaseDriver.driver, createDiscountPage.addComment);
		
		promotionsPageSteps.addComment("Offer Amount Approved");
	}

	@AfterClass
	void kill()
	{
		BaseDriver.closeDriver();
	}
	
}
