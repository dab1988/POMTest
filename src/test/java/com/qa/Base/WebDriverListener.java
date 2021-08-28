package com.qa.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebDriverListener implements WebDriverEventListener
{

	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println(arg1.toString());
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg1.toString());
	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg1.toString());
	}

	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg1.toString());
	}

	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println(arg1.toString());
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg1.toString());
	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg1.toString());
	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg1.toString());
	}

	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg1.toString());
	}

}
