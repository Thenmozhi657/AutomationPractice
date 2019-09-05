package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.Helper.FiledataManager;
import com.cucumber.baseclass.baseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty",
		"json:src\\test\\resource\\com\\cucumber\\reports\\report.json",
		"junit:src\\test\\resource\\com\\cucumber\\reports\\report.xml",
		"html:src\\test\\resource\\com\\cucumber\\reports"},
		features="src\\test\\java\\com\\cucumber\\feature",glue="com.cucumber.stepdefinition",
		tags= {"@APendtoend"},dryRun=false,strict=true,monochrome=true)

public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void setupinitialization() throws Throwable {
		String browsername = FiledataManager.fdm.getConfigReader().getBrowsername();
		driver=baseClass.BrowserLaunch(browsername);
	}
@AfterClass
public static void teardown() throws Exception {
	baseClass.quitWindow();
}
}
