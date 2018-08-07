package com.capg.registration.RegistrationFormTest;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ConferenceRegistrationTest {

	@Test
	public void test() throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/RegistrationForm/ConferenceRegistration.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtFirstName")).sendKeys("jutur");
		driver.findElement(By.id("txtLastName")).sendKeys("tara");
		driver.findElement(By.id("txtEmail")).sendKeys("tara@gmail.com");
		driver.findElement(By.id("txtPhone")).sendKeys("9874563210");

		/*
		 * WebElement element=driver.findElement(By.name("size")); Select se=new
		 * Select(element); se.selectByVisibleText("1");
		 */

		Select people = new Select(driver.findElement(By.name("size")));
		people.selectByIndex(1);
		driver.findElement(By.id("txtAddress1")).sendKeys("H.No:307,Aakruthi Residency");
		driver.findElement(By.id("txtAddress2")).sendKeys("Sanath Nagar");

		Select city = new Select(driver.findElement(By.name("city")));
		city.selectByVisibleText("Hyderabad");

		Select state = new Select(driver.findElement(By.name("state")));
		state.selectByVisibleText("Telangana");

		driver.findElement(By.name("memberStatus")).click();
		driver.findElement(By.linkText("Next")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("Payment Details")) {
		driver.findElement(By.id("txtCardholderName")).sendKeys("jutur tara");
		driver.findElement(By.id("txtDebit")).sendKeys("123456789012");
		driver.findElement(By.id("txtCvv")).sendKeys("325");
		driver.findElement(By.id("txtMonth")).sendKeys("jan");
		driver.findElement(By.id("txtYear")).sendKeys("2018");
		driver.findElement(By.id("btnPayment")).click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		Thread.sleep(3000);
		driver.close();
		}
	}

}
