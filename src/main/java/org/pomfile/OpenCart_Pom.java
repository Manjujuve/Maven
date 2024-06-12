package org.pomfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenCart_Pom {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='Login'])[1]")
	private WebElement login;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(id = "input-password")
	private WebElement password;
	
	@FindBy(xpath = "(//a[text()='Features'])[1]")
	private WebElement features;
	
	@FindBy(xpath = "(//a[text()='Demo'])[1]")
	private WebElement demo;
	
	@FindBy(xpath = "//span[text()='View Store Front']")
	private WebElement storefront;
	
	@FindBy(xpath = "//h2[text()='Administration']")
	private WebElement administration;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getFeatures() {
		return features;
	}

	public WebElement getDemo() {
		return demo;
	}

	public WebElement getStorefront() {
		return storefront;
	}

	public WebElement getAdministration() {
		return administration;
	}
	
	
	
	
	
	

}
