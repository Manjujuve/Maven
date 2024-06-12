package org.adact_stepdef;

import java.io.IOException;

import org.adact_runner.Adactin_runner;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pomfile.Adactin_pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_stepdef extends BaseClass{
	
	WebDriver driver = Adactin_runner.driver;
	
	
	Adactin_pom ad = new Adactin_pom(driver);
	
	@Given("User launch the url and maximing it")
	public void user_launch_the_url_and_maximing_it() {
	    url(driver, "https://adactinhotelapp.com/");
	   
	}
	@When("I enter the valid usernmae")
	public void i_enter_the_valid_usernmae() {
	    toSendValue(ad.getUsername(), "ManjuSVengat");
	}
	@When("I enter the valid password")
	public void i_enter_the_valid_password() {
	    toSendValue(ad.getPassword(), "manju123");
	}
	@Then("I click on the login button")
	public void i_click_on_the_login_button() {
	    toClick(ad.getLogin());
	}
	@When("Select location")
	public void select_location() {
	   toSelect(ad.getLocation(), 4);
	}
    @When("Select the hotels")
	public void select_the_hotels() {
       toSelect(ad.getHotels(), 2);
	}
	@When("Select the Room type")
	public void select_the_room_type() {
       toSelect(ad.getRoomtype(), 4);
	}
	@Then("Select number of rooms")
	public void select_number_of_rooms() {
	    toSelect(ad.getRoomnums(), 3);
	}
	@Then("Enter the checkin date")
	public void enter_the_checkin_date() {
	    toSendValue(ad.getCheckin(), "15/06/2024");
	}
	@Then("Enter the checkout date")
	public void enter_the_checkout_date() {
	  toSendValue(ad.getCheckout(), "20/06/2024");
    }
	@Then("Select Adult per room")
    public void select_adult_per_room() {
	   toSelect(ad.getAdultroom(), 3);
	}
    @Then("Select Children per room")
	public void select_children_per_room() {
	   toSelect(ad.getChildroom(), 1);
	}
	@Then("I click the Search button")
    public void i_click_the_search_button() {
	    toClick(ad.getSearch());
	}
	@Then("I click the hotel")
	public void i_click_the_hotel() {
	    toClick(ad.getClick());
	}
	@Then("I click the continue button")
	public void i_click_the_continue_button() throws InterruptedException {
		Thread.sleep(2000);
	    toClick(ad.getContinu());
	}
	@Then("I enter the firstnmae")
	public void i_enter_the_firstnmae() {
	    toSendValue(ad.getFirstname(), "Manju");
	}
	@Then("I enter the lastname")
	public void i_enter_the_lastname() {
	    toSendValue(ad.getLastname(), "Vengat");
	}
	@Then("I enter the address")
	public void i_enter_the_address() {
	    toSendValue(ad.getAddress(), "Pallavan nagar,Chennai-115");
	}
	@Then("I enter the credit card number")
	public void i_enter_the_credit_card_number() {
	    toSendValue(ad.getCcnum(), "1234567890123456");
	}
	@Then("I select the card type")
	public void i_select_the_card_type() {
	    toSelect(ad.getCctype(), 2);
	}
	@Then("I select the expiry month")
	public void i_select_the_expiry_month() {
	    toSelect(ad.getExpmonth(), 7);
	}
	@Then("I select the expiry year")
	public void i_select_the_expiry_year() {
	   toSelect(ad.getExpyear(), "2026");
	}
	@Then("I enter the cvv number")
	public void i_enter_the_cvv_number() {
	    toSendValue(ad.getCvv(), "234");
	}
	@Then("I click the booknow button")
	public void i_click_the_booknow_button() throws InterruptedException {
	    Thread.sleep(3000);
	    toClick(ad.getBooking());
	}
	@Then("I click the itinerary button")
	public void i_click_the_itinerary_button() throws InterruptedException   {
		Thread.sleep(2000);
	   toClick(ad.getItinerary());
	}
	@Then("I Click the order id of the hotel")
	public void i_click_the_order_id_of_the_hotel()  {
	    toClick(ad.getOrderid());
	}
	@Then("I click the cancel button")
	public void i_click_the_cancel_button() {
	   toClick(ad.getCancel());
	}
	@Then("I click ok in alert box")
	public void i_click_ok_in_alert_box() throws InterruptedException {
		Thread.sleep(3000);
	    toAlert(driver);
	}
	@Then("I click the logout button")
	public void i_click_the_logout_button() {
	    toClick(ad.getLogout());
	}


	






}
