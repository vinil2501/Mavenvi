package com.Mavenvi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven_Basic 
{
	
	public static void main(String[] args) throws IOException 
	{
	 System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\chrome2\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.indianbank.net.in/jsp/startIBPreview.jsp");
	 System.out.println("Successfully Launched");
	 TakesScreenshot ts = (TakesScreenshot) driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 File destination = new File("C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\destination.png");
	 FileUtils.copyFile(source, destination);			 
    }
}
