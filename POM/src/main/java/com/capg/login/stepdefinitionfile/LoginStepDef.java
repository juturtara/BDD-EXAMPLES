package com.capg.login.stepdefinitionfile;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.capg.login.pojobean.LoginPojoBean;
import com.cg.login.util.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	Driver util = new Driver();
	static WebDriver driver;
	LoginPojoBean loginbean;
	
	@Before
	public void init() {

		util.startDriver();
	}
	
	@Given("^I have a login form$")
	public void i_have_a_login_form() throws Throwable {
		
		
		driver = util.getDriver();
		loginbean = new LoginPojoBean();
		PageFactory.initElements(driver, loginbean);
	}

	@When("^Username and password matches$")
	public void username_and_password_matches() throws Throwable {
		
		loginbean.setUname("tarara");
		loginbean.setPwd("raaaaaa");
	
		
	}

	@Then("^Login successfull$")
	public void login_successfull() throws Throwable {
		loginbean.clickNextPage();
	}
	
	
	/*@After
	public void closeDriver() {
		driver.close();
	}
	*/
	

}
