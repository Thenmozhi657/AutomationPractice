package com.cucumber.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseClass {

	public static WebDriver driver;

	public static WebDriver BrowserLaunch(String browsernam) throws Exception {
		try {
			if (browsernam.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
						+ "\\src\\test\\resource\\com\\cucumber\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsernam.equalsIgnoreCase("internet explorer")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "\\driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void waitforExplicit(WebElement element) throws Exception {

		try {
			WebDriverWait wd = new WebDriverWait(driver, 60);
			wd.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static boolean isSelected(WebElement element) throws Exception {
		try {
			boolean selected = element.isSelected();
			return selected;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static boolean isdisplayed(WebElement element) throws Exception {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static boolean isenabled(WebElement element) throws Exception {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void inputvalues(WebElement element, String values) throws Exception {
		try {
			waitforExplicit(element);
			if (isdisplayed(element) && isenabled(element)) {
				element.clear();
				element.sendKeys(values);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void doubleclick(WebElement element) throws Exception {
		try {
			waitforExplicit(element);
			Actions ac = new Actions(driver);
			ac.doubleClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void rightClick(WebElement element) throws Exception {
		try {
			waitforExplicit(element);
			Actions ac = new Actions(driver);
			ac.contextClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void navigateCmds(String options) throws Exception {
		try {
			if (options.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			} else if (options.equalsIgnoreCase("bacward")) {
				driver.navigate().back();
			} else if (options.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static String currentUrl() throws Exception {
		try {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void navigateUrl(String url) throws Exception {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void getUrl(String url) throws Exception {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static String getTitle() throws Exception {
		try {
			String title = driver.getTitle();
			return title;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void scrolltowebelement(WebElement element) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void scrollUsingPixels(int width, int height) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("windows.scrollby(" + width + "," + height + ") ");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void scrollthePage() throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("windows.scrollto(0,document.body.scrollheight)");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void mouseOver(WebElement element) throws Exception {
		try {
			waitforExplicit(element);
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void dragDrop(WebElement source, WebElement destination) throws Exception {
		try {
			waitforExplicit(source);
			Actions ac = new Actions(driver);
			ac.dragAndDrop(source, destination).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void dropDown(WebElement element, String value, String options) throws Exception {
		try {
			waitforExplicit(element);
			Select sc = new Select(element);
			if (options.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (options.equalsIgnoreCase("visibletext")) {
				sc.selectByVisibleText(value);
			} else if (options.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static String getText(WebElement element) throws Exception {
		try {
			waitforExplicit(element);
			String text = element.getText();
			return text;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static String getAttribute(WebElement element, String value) throws Exception {
		try {
			waitforExplicit(element);
			String attribute = element.getAttribute(value);
			return attribute;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void Click(WebElement element) throws Exception {
		try {
			waitforExplicit(element);
			if (isdisplayed(element)) {
				element.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static void alAccept() throws Exception {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void alDismiss() throws Exception {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void alSendkeys(String input) throws Exception {
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(input);
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void defaultContent() throws Exception {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void windowHandle(String windowtitle) throws Exception {
		try {
			String pid = driver.getWindowHandle();
			Set<String> allid = driver.getWindowHandles();
			for (String x : allid) {
				driver.switchTo().window(x);
				String title = driver.getTitle();
				if (title.equals(windowtitle)) {
					driver.switchTo().window(x);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static List<String> webTable(String header) throws Exception {
		try {
			List<String> li = new ArrayList<String>();
			WebElement table = driver.findElement(By.xpath("//table"));
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			for (int i = 0; i < rows.size(); i++) {
				List<WebElement> head = rows.get(i).findElements(By.tagName("th"));
				for (int j = 0; j < head.size(); j++) {
					String text = head.get(j).getText();
					if (text.equals(header)) {
						List<WebElement> tdata = rows.get(j).findElements(By.tagName("td"));
						for (int k = 0; k < tdata.size(); k++) {
							String tcontent = tdata.get(k).getText();
							li.add(tcontent);
						}
					}
				}
			}
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();

		}
	}

	public static void frame(WebElement element) throws Exception {

		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static File screenShot(String filename) throws Exception {
		try {
			File dest = new File(System.getProperty("user.dir") + "/SeleniumProgram/snap/" + filename + ".png");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, dest);
			return dest;
		} catch (Exception e) {
			e.printStackTrace();
		}
		throw new Exception();

	}

	public static void close() throws Exception {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		throw new Exception();
	}

	public static void quitWindow() throws Exception {

		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		throw new Exception();
	}

	public static void highlightwebelement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setattribute('style',background:yellow;border:2px solid red;');", element);
	}
	
}
