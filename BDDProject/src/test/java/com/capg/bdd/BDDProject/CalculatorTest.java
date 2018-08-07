package com.capg.bdd.BDDProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorTest {

	@Test
	public void init() {
		try {
			i_have_a_calculator();
			i_add_and4(5, 6);
			the_result_should_be2(5);
		
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void beforeScenario() {
		System.out.println("This will run before the Scenario");
	}

	@After
	public void afterScenario() {
		System.out.println("This will run after the Scenario");
	}

	@Given("^I have a calculator$")
	public void i_have_a_calculator() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("i am a given method");
	}

	@When("^I add -(\\d+) and (\\d+)$")
	public void i_add_and(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("i am a when method1");
	}

	@Then("^the result should be (\\d+)$")
	public void the_result_should_be1(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("i am then method1");
	}

	@When("^I add (\\d+) and (\\d+)$")
	public void i_add_and2(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("i am a when method2");
	}

	@When("^I add (\\d+) and -(\\d+)$")
	public void i_add_and3(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("i am a when method3");
	}

	@When("^I add -(\\d+) and -(\\d+)$")
	public void i_add_and4(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("i am a when method4");
	}

	@Then("^the result should be -(\\d+)$")
	public void the_result_should_be2(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("i am then method2");
	}

}
