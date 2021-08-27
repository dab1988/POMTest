package appplicationPagesSteps;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.Base.BaseDriver;
import com.qa.pages.customerPage;
import com.qa.utilPackage.selectDropDownValue;

public class addCustomerPage extends customerPage
{
	public addCustomerPage()
	{
		super();
	}
	
	public static void clickCustomers()
	{
		customerPage.customerTab.click();
	}
	
	public static void createCustomer()
	{
		customerPage.newCustom.click();
	}
	
	public static String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public static void addCustomer()
	{
		customerPage.addCustomer.click();
	}
	
	public static void enterEmail(String email)
	{
		customerPage.email.sendKeys(email+RandomStringUtils.randomAlphabetic(3)+"@gmail.com");
	}
	
	public static void enterPassword(String Password)
	{
		customerPage.Password.sendKeys(Password);
	}
	
	public static void enterFirstName(String FName)
	{
		customerPage.FirstName.sendKeys(FName);
	}
	
	public static void enterLastName(String LName)
	{
		customerPage.LastName.sendKeys(LName);
	}
	
	public static void gender(String gender)
	{
		if(gender.equals("Male"))
		{
		customerPage.Male.click();
		}
		
		else
		{
			customerPage.Female.click();
		}
		
	}
		
	public static void DOB(String DOB)
	{
		customerPage.dob.sendKeys(DOB);
	}
	
	public static void selectCompany(String company)
	{
		customerPage.company.sendKeys(company);
	}
	
	
	public static void taxExempt(String taxCheck)
	{
		
		if(taxCheck.equals("Y"))
		{
		
		customerPage.isTaxExempt.click();
	
		}
	}
	
	public static void Newsletter()
	{
		BaseDriver.waitUtil().until(ExpectedConditions.elementToBeClickable(customerPage.Newsletter)).click();;
		//customerPage.Newsletter.click();
		
		
			BaseDriver.waitUtil().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[text()='Test store 2']"))).click();;	
		//customerPage.TeststoreName2.click();
	
	}
	
	public static void customerRoles(String roleCustomer) throws Exception
	{
		customerPage.customerRole.click();
		Thread.sleep(500);
		switch(roleCustomer)
		{
		
		case "Administrators":
BaseDriver.waitUtil().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[text()='Administrators']"))).click();
			//customerPage.Administrators.click();
			break;
		
		case "ForumModerators":
			
			customerPage.ForumModerators.click();
			break;
			
        case "Guests":
			
			customerPage.Guests.click();
			break;
			
        case "Registered":
			
			customerPage.Registered.click();
			break;	
			
			default:
				customerPage.Vendors.click();
		}
	}
	
	public static void manageVendor(String index)
	{
		selectDropDownValue.selectCustomerValue(customerPage.Managerofvendor, index);
	}
	
	public static void adminComment(String comment)
	{
		customerPage.AdminComment.sendKeys(comment);
	}
	
	public static void clickSave()
	{
		customerPage.btnsave.click();;
	}
	
	public static String  messageAfterSave()
	{
		String msg = driver.findElement(By.tagName("body")).getText();
		return msg;
	}
}