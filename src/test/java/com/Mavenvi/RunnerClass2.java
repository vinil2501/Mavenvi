package com.Mavenvi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RunnerClass2 extends BaseClass2
{
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = LaunchBrowser("chrome");
		//LaunchBrowser("chrome");
		timeou();
		maximize();
		geturl("https://www.google.co.in/");
		gettitle();
		getcurrenturl();
		getText();
		getAttribute();
		navigate("http://automationpractice.com/index.php");
		Scroll(0,1000);
		Screenshot("image9");
		Scroll(0,-1000);
		Screenshot("image10");
		WebElement searchbar = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		sendvalues(searchbar, "dress");
		WebElement click1 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		elementclick(click1);
	
		navigate("https://adactinhotelapp.com/");
		navigateback();
		navigateforw();
		navigateRefresh();
		navigate("https://adactinhotelapp.com/");
		
		WebElement username = driver.findElement(By.name("username"));
		sendvalues(username, "Vinil2501");
		//username.sendKeys("Vinil2501");
		
		WebElement password = driver.findElement(By.name("password"));
		sendvalues(password, "jefina");
		//password.sendKeys("jefina");
		
		WebElement click2 = driver.findElement(By.xpath("//input[@type='Submit']"));
		elementclick(click2);
		
		WebElement locate = driver.findElement(By.name("location"));
		singleDropDown(locate, "5", "index");
//		Select B1 = new Select(locate);
//		B1.selectByIndex(5);
		
		WebElement hotel = driver.findElement(By.name("hotels"));
		singleDropDown(hotel, "Hotel Sunshine", "visible");
//		Select B2 = new Select(hotel);
//		B2.selectByIndex(3);
		
		
		
		WebElement room = driver.findElement(By.name("room_type"));
		singleDropDown(room, "Deluxe", "value");
//		Select B3 = new Select(room); 	
//		B3.selectByIndex(2);
		
		Screenshot("image8");
	
		
		
//		quit();
		
//    	Closewindow();
    	
    	
					
	}
}
