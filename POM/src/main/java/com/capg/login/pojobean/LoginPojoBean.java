package com.capg.login.pojobean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPojoBean {

	@FindBy(how = How.NAME, name = "uname")
	private WebElement uname;

	@FindBy(how = How.NAME, name = "pwd")
	private WebElement pwd;

	@FindBy(how = How.NAME, name = "submit")
	private WebElement submit;

	@FindBy(how = How.NAME, name = "cancel")
	private WebElement cancel;

	public String getUname() {
		return uname.getAttribute("value");
	}

	public void setUname(String uname) {
		this.uname.sendKeys(uname);
	}

	public String getPwd() {
		return pwd.getAttribute("value");
	}

	public void setPwd(String pwd) {
		this.pwd.sendKeys(pwd);
	}

	
	public void clickNextPage() {
		submit.click();
	}
	

}
