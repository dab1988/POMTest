package com.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.net.*;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseDriver 
{

	public static WebDriver driver=null;
	public static EventFiringWebDriver ldriver=null;
	public static Properties pro=null;
	public static FileInputStream fis=null; 
    public static Logger log=null;
    public static final String USERNAME = "delankoh_uk98V2";
    public static final String AUTOMATE_KEY = "YXWCpMeSmz7fHTLUZDMw";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
    public static void BaseUtilDeiver() throws Exception
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\ecclipse\\POMTest\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		//https://www.browserstack.com/docs/automate/selenium/getting-started/java#next-steps
	/*	DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("browserstack.networkLogs", "true");
		caps.setCapability("browserstack.idleTimeout", "300");*/
		log=Logger.getLogger(Log.class.getName());
		PropertyConfigurator.configure("log4j.properties");
		driver= new ChromeDriver();
		//driver= new RemoteWebDriver(new URL(URL), caps);
	//	ldriver= new EventFiringWebDriver(driver);
		//WebDriverListener eventListener= new WebDriverListener();
		
		//driver.register(eventListener);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.MICROSECONDS);
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
				driver.get(pro.getProperty("url"));
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
		driver.quit();
	}
	
	public static String pageTitle()
	{
		return driver.getTitle();
	}
	
	public static WebDriverWait waitUtil()
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		return wait;
		
	}
	
}
