package com.Mavenvi;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Method_Practice 
{
	public  int addition(int a,int b) 
	{ 
	 int c=a+b;
	 //System.out.println(c);
	 
	 System.out.println("Addition Practice");
	 return c;
	}
	public static WebDriver driver;
	public void browserLaunch() throws NullPointerException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browsername1 = s.nextLine();
		if(browsername1.equalsIgnoreCase("chrome")) 
		{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\chrome2\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browsername1.equalsIgnoreCase("firefox")) 
		{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\chrome2\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else 
		{
		System.out.println("Invalid Browser Name");
		}
	}
	public static void main(String[] args) 
	{
		Method_Practice add = new Method_Practice();
		add.browserLaunch(); 
		try
		{
		driver.quit();
		}
		catch (NullPointerException ne)
		{
		System.out.println("NO Such Browser");	
		}
		System.out.println(add.addition(5,6));
	}
	
}
	