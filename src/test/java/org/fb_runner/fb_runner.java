package org.fb_runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Facebook\\fb.feature",glue="org.fb_stepdef")
public class fb_runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		driver = new ChromeDriver();

	}

}
