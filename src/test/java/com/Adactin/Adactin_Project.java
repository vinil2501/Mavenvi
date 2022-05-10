package com.Adactin;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Project 
{
	public static void main(String[] args) throws AWTException, IOException
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\chrome2\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//a[@href='Register.php']")).click();
	WebElement username = driver.findElement(By.name("username"));
	username.sendKeys("Vinil2501");
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("jefina");
	driver.findElement(By.xpath("//input[@type='Submit']")).click();
	WebElement locate = driver.findElement(By.name("location"));
	Select B1 = new Select(locate);
	B1.selectByIndex(5);
	WebElement hotel = driver.findElement(By.name("hotels"));
	Select B2 = new Select(hotel);
	B2.selectByIndex(3);
	WebElement room = driver.findElement(By.name("room_type"));
	Select B3 = new Select(room); 	
	B3.selectByIndex(2);
	WebElement roomno = driver.findElement(By.name("location"));
	Select B4 = new Select(roomno);
	B4.selectByIndex(3);
	WebElement checkindate = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
	checkindate.sendKeys("25/04/2022");
	WebElement checkoutdate = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));
	checkoutdate.sendKeys("29/04/2022");
	WebElement adult = driver.findElement(By.id("adult_room"));
	Select B5 = new Select(adult);
	B5.selectByIndex(2);
	WebElement child = driver.findElement(By.id("child_room"));
	Select B6 = new Select(child);
	B6.selectByIndex(2);
	driver.findElement(By.id("Submit")).click();
	driver.findElement(By.xpath("//a[@href='Logout.php']")).click();
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\destination\\image1.png");
    FileUtils.copyFile(source, destination);
    driver.close();
	}
}	
	