package com.Mavenvi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass1 
{
	public static WebDriver driver;
	
	public static void geturl(String url) 
	{
		driver.get(url);
	}
	public static void clickingElement(WebElement Element) 
	{	
		Element.click();
	}
	public static void feedingMailId(WebElement Element, String mailid ) 
	{

		Element.sendKeys(mailid);
	}
//	public static void close() 
//	{
//		driver.close();
//	}
//	public static void quit()
//	{
//		driver.quit();
//	}
}
