package com.cucumber.Helper;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.LoginPage;
import com.cucumber.pom.OrderPage;
import com.cucumber.pom.signIn;

public class SingletonPrgm {
public WebDriver driver;
public SingletonPrgm(WebDriver ldriver) {
	this.driver=ldriver;
}
private LoginPage lp;
private OrderPage op;
private signIn si;

public LoginPage getLp() {
	if(lp==null)
	lp=new LoginPage(driver);
	return lp;
}
public OrderPage getOp() {
	if(op==null)
		op=new OrderPage(driver);
	return op;
}
public signIn getSi() {
	if(si==null)
		si=new signIn(driver);
	return si;
}
	
}

