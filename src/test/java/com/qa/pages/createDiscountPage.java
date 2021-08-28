package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.BaseDriver;

public class createDiscountPage extends BaseDriver
{

	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[5]/a")
	protected
	static WebElement clickPromotions;
	
	
	@FindBy(xpath="//*[@href=\"/Admin/Discount/List\"]")
	protected
	static WebElement clickDiscount;
	
	
	@FindBy(xpath="//*[@href=\"/Admin/Discount/Create\"]")
	public static WebElement clickAddNew;
	
	@FindBy(css="input[id=Name]")
	protected static WebElement enterFirstName;
		
	@FindBy(css="Select[id=DiscountTypeId]")
	protected static WebElement dropDownListDiscount;
	
	@FindBy(xpath="//input[@title='0.0000 USD']")
	protected static WebElement discountAmount;
	
	@FindBy(css="input#StartDateUtc")
	protected static WebElement startDate;
	
	@FindBy(css="input#EndDateUtc")
	protected static WebElement endDate;
	
	@FindBy(css="Select#DiscountLimitationId")
	protected static WebElement disCountLimit;
	
	@FindBy(css="textarea#AdminComment")
	public static WebElement addComment;
	
	public createDiscountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
}
