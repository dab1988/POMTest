package com.qa.seleniumPractice;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class checkBoxes 
{

	WebDriver driver;
	//
	//
	@BeforeMethod
	void setUp()
	{
       System.setProperty("webdriver.chrome.driver","D:\\ecclipse\\POMTest\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	void test()
	{
		////input[@type="checkbox"]
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		List<WebElement> list= driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		System.out.println(list.size());
		
		list.get(1).click();
		
		list.get(2).click();
		
		list.get(list.size()-1).click();		
		
		
	}
	
	@Test
	void BaicAuth()
	{
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	
	
	@Test
	void checkBoxes()
	{
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		List<WebElement> list= driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(list.size());
		
		for(WebElement el: list)
		{
		if(el.isSelected())
		{
			el.click();
		}
		else
		{
			el.click();
		}
		}
	}
	
	@AfterMethod
	void Close()
	{
		//driver.close();
	}
}
