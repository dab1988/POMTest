package com.qa.utilPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownValue 
{

	
	public static void selectCustomerValue(WebElement locator, String index)
	{
		
		Select select= new Select(locator);
		
		select.selectByIndex(Integer.parseInt(index));
	}
	
}
