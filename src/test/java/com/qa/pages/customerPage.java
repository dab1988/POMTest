package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.BaseDriver;

public class customerPage extends BaseDriver
{

//Add a new manufacturer / nopCommerce administration	
	
	@FindBy(xpath="//button[@name='save']")
	@CacheLookup
	public static WebElement btnsave;
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")
	@CacheLookup
	public static WebElement customerTab;
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a")
	@CacheLookup
	public static WebElement newCustom;
	
	@FindBy(xpath="//a[@href='/Admin/Customer/Create']")
	@CacheLookup
	public static WebElement addCustomer;
	
	//Locators to enter Value to create customet
	
	@FindBy(css="input#Email")
	@CacheLookup
	public static WebElement email;
	
	@FindBy(css="input#Password")
	@CacheLookup
	public static WebElement Password;
	
	@FindBy(css="input[id=FirstName]")
	@CacheLookup
	public static WebElement FirstName;
	
	
	@FindBy(css="input[id=LastName]")
	@CacheLookup
	public static WebElement LastName;
	
	
	@FindBy(css="input[id=Gender_Male]")
	@CacheLookup
	public static WebElement Male;

	

	@FindBy(css="input[id=Gender_Female]")
	@CacheLookup
	public static WebElement Female;
	

	@FindBy(css="input[id*=DateOf]")
	@CacheLookup
	public static WebElement dob;
	
	@FindBy(css="input[id^=Company]")
	@CacheLookup
	public static WebElement company;
	
	@FindBy(xpath="//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	public static WebElement Newsletter;
	
	@FindBy(xpath="//li[text()='Your store name']")
	//@CacheLookup
	public static WebElement storeName;
	
	@FindBy(xpath="//li[text()='Test store 2']")
	@CacheLookup
	public static WebElement TeststoreName2;
	
	//Customer Role
	@FindBy(xpath="//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div")
	@CacheLookup
	public static WebElement customerRole;
	
	@FindBy(xpath="//li[text()='Administrators']")
	@CacheLookup 
    public static WebElement Administrators;
	
	@FindBy(xpath="//li[text()='Forum Moderators']")
	@CacheLookup
	public static WebElement ForumModerators;
	
	@FindBy(xpath="//li[text()='Guests']")
	@CacheLookup
	public static WebElement Guests;
	

	@FindBy(xpath="//li[text()='Registered']")
	@CacheLookup
	public static WebElement Registered;
	

	@FindBy(xpath="//li[text()='Vendors']")
	@CacheLookup
	public static WebElement Vendors;

	//Manage Vendors
	@FindBy(xpath="//*[@id='VendorId']")
	@CacheLookup
	public static WebElement Managerofvendor;

	@FindBy(xpath="//*[@id='AdminComment']")
	@CacheLookup
	public static WebElement AdminComment;
	
	@FindBy(xpath="//*[@id='IsTaxExempt']")
	@CacheLookup
	public static WebElement isTaxExempt;
		
	public customerPage()
	{
		PageFactory.initElements(driver, this);
	}
}
