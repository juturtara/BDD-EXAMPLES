package com.capg.selenium.GoogleSelTest;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExcelpoiTest {

	static WebDriver driver;
	Logger logger = Logger.getLogger(App.class.getName());
	
	@Given("^I have a google account$")
	public void i_have_a_google_account() {
		driver.get("https://github.com/login");
		String title=driver.getTitle();
		if(title.equals("Sign in to GitHub · GitHub")){
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
	public void username_and_password_matches() throws Throwable {
	
		InputStream ExcelFileToRead = new FileInputStream("D:/Book1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		
		for(int row = 1; row <= rowCount; row++) {
		
			String userName = sheet.getRow(row).getCell(0).getStringCellValue();
			String password = sheet.getRow(row).getCell(1).getStringCellValue();
			
			driver.findElement(By.name("login")).sendKeys(userName);
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(2000);
		}
	
		logger.info("doubleeedone");
	}

	@Then("^Redirect to google login page$")
	public void redirect_to_google_login_page()  {
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
