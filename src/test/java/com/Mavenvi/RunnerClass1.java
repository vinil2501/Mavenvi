package com.Mavenvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerClass1 extends Baseclass1
{
	public static WebDriver driver;
	public static void main(String[] args) 
	{	
	System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\chrome2\\chromedriver.exe");
	driver = new ChromeDriver();
	//driver.get("http://automationpractice.com/index.php");
	geturl("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	WebElement login =driver.findElement(By.xpath("//a[@class='login']"));
	//login.click();
	clickingElement(login);
	WebElement email = driver.findElement(By.id("email"));
	//email.sendKeys("vinil2521");
	feedingMailId(email,"vinil2521"); 
	//close();
	//quit();
	}
	
}			