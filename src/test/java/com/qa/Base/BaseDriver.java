package com.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseDriver 
{

	public static WebDriver driver=null;
	public static EventFiringWebDriver ldriver=null;
	public static Properties pro=null;
	public static FileInputStream fis=null; 
    public static Logger log=null;
	
	public static void BaseUtilDeiver() throws Exception
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\ecclipse\\POMTest\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		log=Logger.getLogger(Log.class.getName());
		PropertyConfigurator.configure("log4j.properties");
		driver= new ChromeDriver();
		ldriver= new EventFiringWebDriver(driver);
		WebDriverListener eventListener= new WebDriverListener();
		
		ldriver.register(eventListener);
		ldriver.manage().window().maximize();
		ldriver.manage().deleteAllCookies();
		ldriver.manage().timeouts().implicitlyWait(60, TimeUnit.MICROSECONDS);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try 
		{
			 fis= new FileInputStream(new File("D:\\ecclipse\\POMTest\\src\\main\\java\\envVar.properties"));
			 pro= new Properties();
				pro.load(fis);
				ldriver.get(pro.getProperty("url"));
				log.info("Driver Lunched");
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void closeDriver()
	{
		//Close Driver
		ldriver.close();
	}
	
	public static String pageTitle()
	{
		return ldriver.getTitle();
	}
	
	public static WebDriverWait waitUtil()
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		return wait;
		
	}
	
}
