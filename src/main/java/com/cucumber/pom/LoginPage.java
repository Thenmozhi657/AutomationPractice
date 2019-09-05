package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//*[@id=\"email\"]")
	private WebElement emailId;
	
	@FindBy(xpath="//*[@id=\"passwd\"]")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]")
	private WebElement loginBtn;
	
	@FindBy(xpath="//span[text()='Poorna Kala']")
	private WebElement headername;
	
	public WebElement getHeadername() {
		return headername;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
	

}
