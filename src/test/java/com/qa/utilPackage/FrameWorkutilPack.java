package com.qa.utilPackage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameWorkutilPack 
{

	public static void elementClick(WebDriver driver, WebElement locator)
	{
		//JavascriptExecutor js= (JavascriptExecutor) driver;
	 	//js.executeScript("arguments[0].value=' "+Uname+" ' ", uname);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", locator);
	}
	
	public static void enterText(WebDriver driver, WebElement locator, String text)
	{
		//JavascriptExecutor js= (JavascriptExecutor) driver;
	 	//js.executeScript("arguments[0].value=' "+Uname+" ' ", uname);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=' "+text+"  '", locator);
	}
	
	public static void scrollWindow(WebDriver driver, WebElement locator)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", locator);
	}
}
