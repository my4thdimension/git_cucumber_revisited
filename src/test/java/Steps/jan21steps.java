package Steps;

import org.testng.Assert;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.SeleniumWebDriver;

public class jan21steps {

	String act_page_title;
	LoginPage lp = new LoginPage();





@When("checks for the Title")
public void checksForTheTitle() {
   System.out.println("am checking the title of the page");
}

@Then("{string} is present as title")
public void isPresentAsTitle(String exp_title) {
	 act_page_title =lp.get_title();
	 System.out.println("Actual title of the page is "+act_page_title);
	 Assert.assertEquals(act_page_title, exp_title,"title of the page does not match" );
   
}




}
