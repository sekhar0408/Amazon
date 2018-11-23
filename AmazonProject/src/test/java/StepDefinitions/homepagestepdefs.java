package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Utilities.util;
import Utilities.webconnector;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jxl.read.biff.BiffException;
import methods.homepagemethods;

public class homepagestepdefs {

	// creating object for methods
	public homepagemethods homepage_method;

	// contructor initialising config file and homepage method
	public homepagestepdefs() throws IOException, BiffException {
		homepage_method = PageFactory.initElements(webconnector.open_browser(), homepagemethods.class);

	}

	// goto website to url
	@Before()
	public void startupurl() {
		webconnector.gotowebsite();
	}

	// click on sign in
	@Given("^Click on Signin$")
	public void click_on_Signin() {

		homepage_method.click_sigin();
	}

	// enter text
	@When("^Enter random message \"([^\"]*)\"$")
	public void enter_random_message(String arg1) {
		homepage_method.email_text1(arg1);
	}

	// clcik on sign in
	@When("^Click on Sign on button$")
	public void click_on_Sign_on_button() {
		homepage_method.clicksignin_emailpage();
	}

	// verfy message
	@Then("^verify the error message \"([^\"]*)\"$")
	public void verify_the_error_message(String agr2) {
		homepage_method.error_emailsiginPage(agr2);
	}

}
