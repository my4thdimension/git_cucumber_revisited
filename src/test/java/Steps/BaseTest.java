package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.SeleniumWebDriver;

public class BaseTest {

	
	@Before
	public void setup() {
		SeleniumWebDriver.setup();
		System.out.println("am in before");
	}
	
	@After
	
	
	  public void release() {
	  
	  
		/*
		 * if(scene.isFailed()) {
		 * System.out.println("my scenario is failed ->"+scene.getName()); byte[]
		 * screenshotBytes =
		 * ((TakesScreenshot)SeleniumWebDriver.get_driver()).getScreenshotAs(OutputType.
		 * BYTES); // scene.embed(screenshotBytes, "image/png");
		 * 
		 * }
		 */
	  
	  SeleniumWebDriver.teardown(); System.out.println("am in after "); }
	 

	
	
	public static void enter_text(By locator, String txt) {
		SeleniumWebDriver.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		SeleniumWebDriver.get_driver().findElement(locator).sendKeys(txt);
	}
	
	public static void click_btn(By locator) {
		SeleniumWebDriver.wait.until(ExpectedConditions.elementToBeClickable(locator));
		SeleniumWebDriver.get_driver().findElement(locator).click();
		
	}
}
