package com.capg.login.test;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "features" }, 
				 format = {"pretty","html:target/reports"},
				 glue = { "com.capg.login.stepdefinitionfile" },
				 tags = { "@execute" })

public class LoginTest {

}
