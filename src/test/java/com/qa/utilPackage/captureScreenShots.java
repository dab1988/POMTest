package com.qa.utilPackage;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class captureScreenShots
{

	
	public static void screenShot(WebDriver driver, String tname )
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\ecclipse\\POMTest\\Screenshots\\"+tname+".jpg");
		try 
		{
			org.openqa.selenium.io.FileHandler.copy(source, target);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screenshot taken");
	}
	
}
