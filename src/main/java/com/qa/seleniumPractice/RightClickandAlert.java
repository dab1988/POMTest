package com.qa.seleniumPractice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RightClickandAlert 
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
				
				//js.executeScript("window.scrollBy(0,250)", "driver.findElement(By.xpath(\"//*[text()='Multiple Windows']\"))");
				
				driver.findElement(By.xpath("//*[text()='Context Menu']")).click();
			
				Thread.sleep(1000);
				
				WebElement div= driver.findElement(By.cssSelector("div#hot-spot"));
				
				Actions action= new Actions(driver);
				action.moveToElement(div).contextClick().build().perform();
				Alert alert=alertHandle(driver);
			
				System.out.println(alert.getText());
				alert.accept();
		}
		
		static Alert alertHandle(WebDriver driver)
		{
			WebDriverWait wait=new WebDriverWait(driver,5);
			return wait.until(ExpectedConditions.alertIsPresent());
			
		}
		@AfterMethod
		void close()
		{
			driver.quit();
		}
	}


