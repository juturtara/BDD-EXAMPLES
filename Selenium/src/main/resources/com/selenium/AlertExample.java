package com.selenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.capg.log4.ProjectLog4j.App;

import junit.framework.TestCase;

public class AlertExample {

	WebDriver driver;
	
	Logger logger = Logger.getLogger(App.class.getName());
	
	@Test
	public void ExampleForAlert() throws InterrruptedException{
		system.setPropety("webdriver.chrome.driver","D:\\Srinivas\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://din6607746:8085/Selenium/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick="+"'alertFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		logger.info(alert.getText());
		alert.accept();
		logger.info("done");
	}