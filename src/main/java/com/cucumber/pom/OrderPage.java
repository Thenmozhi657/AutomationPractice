package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	public WebDriver driver;
	public OrderPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement WomenDress;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a")
	private WebElement SummerDress;
	
	@FindBy(xpath="//select[@id='selectProductSort']")
	private WebElement ProductSort;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img")
	private WebElement slectedimage;
	
	@FindBy(xpath="//*[@id=\"quantity_wanted\"]")
	private WebElement quantity;
		
	@FindBy(xpath="//input[@id='quantity_wanted']")
	private WebElement size;	
	
	@FindBy(xpath="//button[@name='Submit']")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkout;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomenDress() {
		return WomenDress;
	}

	public WebElement getSummerDress() {
		return SummerDress;
	}

	public WebElement getProductSort() {
		return ProductSort;
	}

	public WebElement getSlectedimage() {
		return slectedimage;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
}	