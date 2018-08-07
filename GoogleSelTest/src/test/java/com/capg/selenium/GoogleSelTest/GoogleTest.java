package com.capg.selenium.GoogleSelTest;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleTest {

	static WebDriver driver;
	Logger logger = Logger.getLogger(App.class.getName());

	@Given("^I have a google account$")
	public void i_have_a_google_account() {
		driver.get("https://github.com/login");
		String title = driver.getTitle();
		if (title.equals("Sign in to GitHub · GitHub")) {
			logger.info("done");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^Username and password matches$")
	public void username_and_password_matches() {
		driver.findElement(By.name("login")).sendKeys("tarajutur@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Tarajutur24$");
		logger.info("doubleeedone");
	}

	@Then("^Redirect to google login page$")
	public void redirect_to_google_login_page() {
		driver.findElement(By.name("commit")).click();
		logger.info("tripledone");
	}

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void githubTest() {
		try {
			i_have_a_google_account();
			username_and_password_matches();
			redirect_to_google_login_page();
		} catch (Throwable e) {

			e.printStackTrace();
		}

	}

	@After
	public void closeDriver() {
		driver.close();
	}
}
