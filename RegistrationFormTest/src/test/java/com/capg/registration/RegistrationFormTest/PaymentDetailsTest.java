package com.capg.registration.RegistrationFormTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentDetailsTest {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/RegistrationForm/PaymentDetails.html");
		Thread.sleep(2000);

		driver.findElement(By.id("txtCardholderName")).sendKeys("jutur tara");
		driver.findElement(By.id("txtDebit")).sendKeys("123456789012");
		driver.findElement(By.id("txtCvv")).sendKeys("325");
		driver.findElement(By.id("txtMonth")).sendKeys("jan");
		driver.findElement(By.id("txtYear")).sendKeys("2018");
		driver.findElement(By.id("btnPayment")).click();
		
	}

}
