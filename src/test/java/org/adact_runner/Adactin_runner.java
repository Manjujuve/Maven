package org.adact_runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\adactin_feature\\adactin_login.feature", glue = "org.adact_stepdef",dryRun = false)

public class Adactin_runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		driver = new ChromeDriver();

	}

}


//