package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebDriver {
	private static SeleniumWebDriver sDriver;
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public final static int TIMEOUT = 30;
	public final static int PageLoadTimeOut = 30;
	
	private SeleniumWebDriver() {
		WebDriverManager.chromedriver().setup();
		System.out.println("am creating chrome driver instance ->"+driver);
		if (driver==null) {
		
			driver = new ChromeDriver();
			
			wait = new WebDriverWait(driver,10);
		}
	}

	public static void launch(String url) {
		System.out.println("am launching the url  "+url);
		driver.get(url);
	
	
	}
	
	public static void setup() {
		System.out.println("am in set up method creating private constructor instance");
		sDriver = new SeleniumWebDriver();
	
	}
	
	public static WebDriver get_driver() {
		System.out.println("am getting the driver instance");
		return driver;
	} 
	
	public static void teardown() {
		if (driver!=null) {
			driver.quit();
			driver =null;
			System.out.println("am setting driver to null");
		}
	}
	
	
}

