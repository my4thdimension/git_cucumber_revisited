package Steps;


import org.testng.Assert;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.SeleniumWebDriver;

public class jan21_sc2 {

	String act_dash_board_title;
	LoginPage lp ;
	HomePage hp ;

	@Given("user is on the login page {string}")
	public void userIsOnTheLoginPage(String strUrl) {
	
		lp = new LoginPage();
		SeleniumWebDriver.launch(strUrl);
	}
	
	@When("user enter user name as {string} and password as {string}")
	public void userEnterUserNameAsAndPasswordAs(String uname, String pwd) {
		System.out.println("am here in the method"+lp);
		lp.enter_login_info(uname, pwd);
	}

	@When("clicks on login button")
	public void clicksOnLoginLink() {
	lp.login_click();
	hp = new HomePage();
	}

	@Then("homepage is displayed with title as {string}")
	public void homepageIsDisplayedWithTitleAs(String exp_dash_board_title) {
		act_dash_board_title = hp.get_dash_board_title();
		Assert.assertEquals(act_dash_board_title, exp_dash_board_title,"In correct login, as home page not displayed");
	}

}
