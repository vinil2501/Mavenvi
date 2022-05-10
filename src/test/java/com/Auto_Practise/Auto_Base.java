package com.Auto_Practise;


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
	import org.openqa.selenium.interactions.Actions;
public class Auto_Base 
{
		public static void main(String[] args) throws IOException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\chrome2\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.navigate().to("http://automationpractice.com/index.php");
			driver.findElement(By.xpath("//a[@title='Women']")).click();
			WebElement move1 = driver.findElement(By.xpath("(//div[@class='product-container'])[1]"));
			WebElement move2 = driver.findElement(By.xpath("(//div[@class='product-container'])[2]"));
			WebElement move3 = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript("window.scrollBy(0,1000)", "");
			Actions act = new Actions(driver);
			act.moveToElement(move1).build().perform();
			WebElement find1 = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
			j.executeScript("arguments[0].click()",find1);
			driver.findElement(By.xpath("//i[@class='icon-chevron-left left']//parent::*")).click();
			act.moveToElement(move2).build().perform();
			driver.findElement(By.xpath("(//span[text()='Add to cart'])[2]")).click();
			driver.findElement(By.xpath("//i[@class='icon-chevron-left left']//parent::*")).click();
			j.executeScript("window.scrollBy(0,-1000)", "");
			act.moveToElement(move3).build().perform();
			driver.findElement(By.xpath("(//i[@class='icon-chevron-right right']//parent::*)[1]")).click();
			j.executeScript("window.scrollBy(0,1000)", "");
			driver.findElement(By.xpath("(//i[@class='icon-chevron-right right']//parent::*)[3]")).click();
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			File dest1 = new File("C:\\Users\\hp\\eclipse-workspace\\Mavenvi\\target.png");
			FileUtils.copyFile(source1,dest1);
			driver.quit();
		}
}
 

