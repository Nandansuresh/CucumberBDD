package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumdriver;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public static Select select;
	public static final int TIMEOUT=30;
	public static final int PAGE_LOAD_TIMEOUT=50;
	
	private SeleniumDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		wait = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void DropdownSelect(WebElement locator, String text) {
		select = new Select(locator);
		select.selectByVisibleText(text);
		
	}
	
	public static void setDriver() {
		if(seleniumdriver==null) {
			seleniumdriver= new SeleniumDriver();
		}
	}
	
	public static void tearDown() {
		if(driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumdriver=null;
	}

}
