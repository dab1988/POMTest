package com.qa.seleniumPractice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class handleFrames 
{

	 WebDriver driver;
	
	@Test
	void windowHandle() throws InterruptedException
	{
		
	     System.setProperty("webdriver.chrome.driver","D:\\ecclipse\\POMTest\\chromedriver.exe");
			
	 	     driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get("https://the-internet.herokuapp.com/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,250)", "driver.findElement(By.xpath(\"//*[text()='Multiple Windows']\"))");
			
			driver.findElement(By.xpath("//li//a[text()='Frames']")).click();
		
			Thread.sleep(500);
	
			driver.findElement(By.xpath("//a[contains(text(),'iFrame')]")).click();
		   
			Thread.sleep(500);
			
			driver.switchTo().frame("mce_0_ifr");
			
			Thread.sleep(500);
			
		 String text=	driver.findElement(By.xpath("//*[text()='Your content goes here.']")).getText();
		 System.out.println(text);
	}
	
	@AfterMethod
	void close()
	{
		driver.quit();
	}
}