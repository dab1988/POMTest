package appplicationPagesSteps;

import com.qa.Base.BaseDriver;
import com.qa.pages.createDiscountPage;
import com.qa.utilPackage.FrameWorkutilPack;
import com.qa.utilPackage.selectDropDownValue;

public class promotionsPageSteps extends createDiscountPage
{

	public promotionsPageSteps()
	{
		super();
	}
	
	public static void clickPromotions()
	{
		//FrameWorkutilPack.elementClick(driver, createDiscountPage.clickPromotions);
		createDiscountPage.clickPromotions.click();
	}
	
	public static void clickDiscounts()
	{
		//FrameWorkutilPack.elementClick(driver, createDiscountPage.clickDiscount);
		createDiscountPage.clickDiscount.click();
	}
	
	public static void enterFirstName(String Name)
	{
		createDiscountPage.enterFirstName.sendKeys(Name);
	}
	
	public static void selectDiscountType(String index)
	{
		selectDropDownValue.selectCustomerValue(createDiscountPage.dropDownListDiscount, index);
	}
	
	public static void discountAmount(String amount)
	{
		createDiscountPage.discountAmount.sendKeys(amount);
	}
	
	public static void startDate(String startDate)
	{
		createDiscountPage.startDate.sendKeys(startDate);
	}
	
	public static void endDate(String endDate)
	{
		createDiscountPage.startDate.sendKeys(endDate);
	}
	
	public static void discoutLimit(String limitIndex)
	{
		selectDropDownValue.selectCustomerValue(createDiscountPage.disCountLimit, limitIndex);
	}
	
	public static void addComment(String Comment)
	{
		createDiscountPage.addComment.sendKeys(Comment);
	}
}
