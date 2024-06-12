package org.pomfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_pom {

	public static WebDriver driver;
	
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(xpath="//button[@data-testid='royal_login_button']")
	private WebElement login;
	
    public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public Fb_pom(WebDriver driver1) {
    	this.driver= driver1;
    	PageFactory.initElements(driver, this);
}
}
