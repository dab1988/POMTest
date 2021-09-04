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

public class windowHandle 
{

	 WebDriver driver;
	
	@Test
	void windowHandle() throws InterruptedException
	{
		
	     System.setProperty("webdriver.chrome.driver","D:\\ecclipse\\POMTest\\chromedriver.exe");
			
	 	      driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://the-internet.herokuapp.com/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,250)", "driver.findElement(By.xpath(\"//*[text()='Multiple Windows']\"))");
			
			driver.findElement(By.xpath("//*[text()='Multiple Windows']")).click();
		
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//*[text()='Click Here']")).click();
		    Set<String> handle= driver.getWindowHandles();
		    
		    ArrayList<String> listHandle= new ArrayList<String>(handle);
			
		    System.out.println("Parent Window-->"+ listHandle.get(0));
		    System.out.println("Child Window-->"+ listHandle.get(1));
		    
		    driver.switchTo().window(listHandle.get(1));
		    System.out.println(driver.getTitle());
		    Thread.sleep(1000);
		    String text=driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();
		    System.out.println(text);
	}
	
	@AfterMethod
	void close()
	{
		driver.quit();
	}
}
