package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	public WebDriver driver;
	public LogOut(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	

}
