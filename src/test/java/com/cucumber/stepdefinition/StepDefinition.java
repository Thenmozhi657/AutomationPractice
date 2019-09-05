package com.cucumber.stepdefinition;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.cucumber.Helper.SingletonPrgm;
import com.cucumber.baseclass.baseClass;
import com.cucumber.pom.OrderPage;
import com.cucumber.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition extends baseClass{
	public static WebDriver driver=TestRunner.driver;
	public static SingletonPrgm sp=new SingletonPrgm(driver);

@Given("^User hit the Automation Practice website$")
public void user_hit_the_Automation_Practice_website() throws Throwable {
	//driver = BrowserLaunch("chrome");
	getUrl("http://automationpractice.com/index.php");
}
@Then("^User verify the site logo$")
public void user_verify_the_site_logo() throws Throwable {
	System.out.println("logo site");
	isdisplayed(sp.getSi().getLogo());
}

@Then("^User verifies the page title$")
public void user_verifies_the_page_title() throws Throwable {
	String actual="My Store";
	Assert.assertEquals(getTitle(), actual);
	System.out.println("testcase running successfully");
}
@When("^User click on SignIn button in header$")
public void user_click_on_SignIn_button_in_header() throws Throwable {
	Click(sp.getSi().getSignin());
}
@When("^User enter the email id '(.*)' in the login page$")
public void user_enter_the_email_id_in_the_login_page(String username ) throws Throwable {
	inputvalues(sp.getLp().getEmailId(), username);
}

@When("^User enter the password '(.*)' in the login page$")
public void user_enter_the_password_in_the_login_page(String password) throws Throwable {
	inputvalues(sp.getLp().getPassword(), password);
}

@When("^User click on login button in the login page$")
public void user_click_on_login_button_in_the_login_page() throws Throwable {
	Click(sp.getLp().getLoginBtn());
}

@Then("^User verifies the username 'poorna kala' present in the header$")
public void user_verifies_the_username_poorna_kala_present_in_the_header() throws Throwable {
	 System.out.println("testcase-1 running successfully");
}

@When("^User mouseover the Women option present in the product search page$")
public void user_mouseover_the_Women_option_present_in_the_product_search_page() throws Throwable {
	mouseOver(sp.getOp().getWomenDress());
	System.out.println("mouseover");
}

@When("^User click the Summer dresses appear in the category page$")
public void user_click_the_Summer_dresses_appear_in_the_category_page() throws Throwable {
	Click(sp.getOp().getSummerDress());
	System.out.println("summer dress");
}

@Then("^User verifies the SUMMER DRESSES displayed in the product page$")
public void user_verifies_the_SUMMER_DRESSES_displayed_in_the_product_page() throws Throwable {
	
	System.out.println("summer dress displayed");
    
}

@Then("^User select the dropdown button to sort the product$")
public void user_select_the_dropdown_button_to_sort_the_product() throws Throwable {
//	OrderPage op=new OrderPage(driver);
//	dropDown(op.getProductSort(),"3","index");
	System.out.println("sorting");
}

@Then("^User click on the selected product$")
public void user_click_on_the_selected_product() throws Throwable {
	Click(sp.getOp().getSlectedimage());
	System.out.println("product");
}

@Then("^User verfies whether the same product is displayed$")
public void user_verfies_whether_the_same_product_is_displayed() throws Throwable {
	System.out.println("testcase2 is running successfully");
	
    
}

@When("^User choose the Quantity and size present in the cart page$")
public void user_choose_the_Quantity_and_size_present_in_the_cart_page() throws Throwable {
//	OrderPage op=new OrderPage(driver);
//	inputvalues(op.getQuantity(),"5");
////	dropDown(op.getSize(),"L","visibletext");
	System.out.println("size and quantity selected");
    
}

@When("^User click on the add to cart button$")
public void user_click_on_the_add_to_cart_button() throws Throwable {
	OrderPage op=new OrderPage(driver);
	Click(op.getAddtocart());
	System.out.println("click add to cart button");
    
}

@Then("^User Verfy the product add to cart successfully$")
public void user_Verfy_the_product_add_to_cart_successfully() throws Throwable {
    System.out.println("product selected successfully");
    
}

@Then("^User click on the proceed to checkout button$")
public void user_click_on_the_proceed_to_checkout_button() throws Throwable {
	OrderPage op=new OrderPage(driver);
	Click(op.getCheckout());
    
}

@Then("^verify the product summary page$")
public void verify_the_product_summary_page() throws Throwable {
    System.out.println("summary page");
}
}
