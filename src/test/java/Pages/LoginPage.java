package Pages;

import org.openqa.selenium.By;

import Steps.BaseTest;
import utils.SeleniumWebDriver;

public class LoginPage {
 
	private By login_id = By.id("txtUsername");
	private By login_pwd = By.id("txtPassword");
	private By login_btn = By.id("btnLogin");

	public void enter_login_info(String id, String pwd) {

	BaseTest.enter_text(login_id, id);
	BaseTest.enter_text(login_pwd, pwd);
	}
	
	public void login_click() {
		BaseTest.click_btn(login_btn);
	}
	public String get_title() {
		return SeleniumWebDriver.get_driver().getTitle();
	}
}