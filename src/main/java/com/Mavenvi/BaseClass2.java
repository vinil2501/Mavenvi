package com.Mavenvi;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass2 
{
	public static WebDriver driver;
//Timeout	
	public static void timeou() 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
//Browser Launch
	public static WebDriver LaunchBrowser(String browsername) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\chrome2\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
//Maximize
	public static void maximize() 
	{
		driver.manage().window().maximize();
			
	}	
//Get URL
	public static void geturl(String url) 
	{
		driver.get(url);	

	}
//Get current URL
	public static void getcurrenturl() 
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}
//Get Title
	public static void gettitle() 
	{		
		String title = driver.getTitle();
		System.out.println(title);
	}
//Get Text
	public static void getText() 
	{
		WebElement findtext = driver.findElement(By.linkText("Gmail"));
		findtext.getText();
		System.out.println(findtext);
			
	}
//Get Attribute
	public static void getAttribute() 
	{
		WebElement findattribute = driver.findElement(By.linkText("Images"));
		findattribute.getAttribute("Images");
		System.out.println(findattribute);
			
	}
//Navigate
	public static void navigate(String value) 
	{
		driver.navigate().to(value);
		
	}
//Navigate back
	public static void navigateback() 
	{
		driver.navigate().back();

	}
//Navigate forward
	public static void navigateforw() 
	{
		driver.navigate().refresh();

	}
//Navigate refresh
	public static void navigateRefresh() 
	{
		driver.navigate().refresh();

	}	
//Take Screen Shot
	public static void Screenshot(String path) throws IOException 
	{
		TakesScreenshot ts3 = (TakesScreenshot)driver;
		File source3 = ts3.getScreenshotAs(OutputType.FILE);
		File dest3 = new File("C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\destination\\"+path+".png");
		FileUtils.copyFile(source3,dest3);
	}
//Web Element
	public static void sendvalues(WebElement element1, String searchitem) 
	{
		element1.sendKeys(searchitem);
	
	}
//click
	public static void elementclick(WebElement element2) 
	{
		element2.click();
	
	}
//Single Drop down
	public static void singleDropDown(WebElement element, String value,String methodType) 
	{
	Select B1 = new Select(element);
		if(methodType.equalsIgnoreCase("value"))
		{	
		B1.selectByValue(value);
		}
		else if(methodType.equalsIgnoreCase("visible"))
		{	
		B1.selectByVisibleText(value);
		}
		else if(methodType.equalsIgnoreCase("index"))
		{
		int index = Integer.parseInt(value);
		B1.selectByIndex(index);
		}		
	}
//Scroll UP and Down
	public static void Scroll(long a, long b) 
	{
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+a+","+b+")", "");
	}
//GetFSelected Options
	public static void GetFSelected_Options() 
	{
		driver.close();
	}

//Close Window
	public static void Closewindow() 
	{
		driver.close();
	}
//Quit
	public static void quit() {
		driver.quit();
	}
	
}
