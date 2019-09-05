package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signIn {
	public WebDriver driver;

	public signIn(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//img[@alt='My Store']")
	private WebElement logo;

	public WebElement getLogo() {
		return logo;
	}

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignin() {
		return signin;
	}






}
