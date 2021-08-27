package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Base.BaseDriver;
import com.qa.utilPackage.FrameWorkutilPack;

public class loginPage extends BaseDriver
{

	@FindBy(xpath="//*[text()='Admin area demo']")
	@CacheLookup
	private WebElement areaDemoText;
	
	@FindBy(xpath="//*[text()=\"Welcome, please sign in!\"]")
	@CacheLookup
	private WebElement welComeText;
	
	@FindBy(xpath="//*[contains(@value,'admin@yourstore.com')]")
	@CacheLookup
	private WebElement uname;
	
	
	@FindBy(xpath="//label[text()='Password:']/following-sibling::input[contains(@name,'Password')]")
	@CacheLookup
	private WebElement password;

	
	@FindBy(id="RememberMe")
	@CacheLookup
	private WebElement remeberMeCheckBox;
	
	@FindBy(xpath="//label[text()='Remember me?']")
	@CacheLookup
	private WebElement remeberMetextLabel;	
	
	@FindBy(xpath="//button[text()='Log in']")
	@CacheLookup
	private WebElement loginButton;
	
	
	public loginPage() throws Exception
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void login() 
	{
		remeberMeCheckBox.click();
		loginButton.click();
	}
	
	public String remeberMetextLabel()
	{
		return remeberMetextLabel.getText();
	}
	
	public String welComeText()
	{
		return welComeText.getText();
	}
}
