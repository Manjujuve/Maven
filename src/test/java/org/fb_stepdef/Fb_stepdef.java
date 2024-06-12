package org.fb_stepdef;

import org.baseclass.BaseClass;
import org.fb_runner.fb_runner;
import org.openqa.selenium.WebDriver;
import org.pomfile.Fb_pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fb_stepdef extends BaseClass {
	
	WebDriver driver = fb_runner.driver;
	
	Fb_pom  fd = new Fb_pom(driver);
	
	@Given("user launch the url and maximizing")
	public void user_launch_the_url_and_maximizing() {
		url(driver, "https://www.facebook.com/");
	}
	@When("I enter the {string}")
	public void i_enter_the(String username) {
		toSendValue(fd.getUsername(), username);
	}
	@Then("enter the {string}")
	public void enter_the(String password) {
		toSendValue(fd.getPassword(), password);
	}
	@Then("I click on the login button")
	public void i_click_on_the_login_button() {
	    toClick(fd.getLogin());
	}
	

}
