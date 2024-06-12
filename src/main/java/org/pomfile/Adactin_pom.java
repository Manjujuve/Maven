package org.pomfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_pom {
	
	public static WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement roomnums;
	@FindBy(id="datepick_in")
	private WebElement checkin;
	@FindBy(id="datepick_out")
	private WebElement checkout;
	@FindBy(id="adult_room")
	private WebElement adultroom;
	@FindBy(id="child_room")
	private WebElement childroom;
	@FindBy(id="Submit")
	private WebElement search;
	@FindBy(id="radiobutton_0")
	private WebElement click;
	@FindBy(id="continue")
	private WebElement continu;
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccnum;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement booking;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement itinerary;
	@FindBy(xpath="//input[@name='ids[]']")
	private WebElement orderid;
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancel;
	@FindBy(id="logout")
	private WebElement logout;
	

	public WebElement getItinerary() {
		return itinerary;
	}
	public WebElement getOrderid() {
		return orderid;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooking() {
		return booking;
	}
	public WebElement getClick() {
		return click;
	}
	public WebElement getContinu() {
		return continu;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomnums() {
		return roomnums;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	public Adactin_pom(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		
		
	}
	

}
