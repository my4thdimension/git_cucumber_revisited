package Pages;

import org.openqa.selenium.By;

import utils.SeleniumWebDriver;

public class HomePage {

private	By dash_board_title = By.xpath("//div[@class='nav-wrapper row']/ul/li");


public String get_dash_board_title(){
	return SeleniumWebDriver.get_driver().findElement(dash_board_title).getText();
}
}
