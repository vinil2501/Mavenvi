package com.Mavenvi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_Adactin_Login 
{
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement loginbtn;
	
	public WebElement getUsername() 
	{
		return username;
	}
	public WebElement getPassword() 
	{
		return Password;
	}
	public WebElement getLoginbtn() 
	{
		return loginbtn;
	}

	

}
 