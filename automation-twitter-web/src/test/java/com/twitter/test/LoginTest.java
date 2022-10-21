package com.twitter.test;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.twitter.page.LoginPage;

public class LoginTest extends BaseTest {

	private WebDriver driver = null;
	private LoginPage loginPage = null;

	private static final Logger logger = Logger.getLogger(LoginTest.class.getName());

	@BeforeClass
	public void initMethod() {

		logger.info("Starting of init method");

		this.driver = this.getWebDriver();
		driver.get("https://twitter.com/");
		this.loginPage = new LoginPage(driver);


		logger.info("Ending of init method");
	}

	@Test(priority = 1, description = "loginTwitter")
	public void signinTwitter() throws InterruptedException {

		logger.info("Starting of signinTwitter method");

		this.loginPage.scrollDown(300);
		this.loginPage.clickOnSignin();

		String signInTotwitterText = this.loginPage.getSignInToTwitter();
		Assert.assertEquals(signInTotwitterText, expectedassertionsprop.getProperty("sign.in.to.twitter.text"));

		this.loginPage.setEmail(testDataProp.getProperty("email.text"));
		this.loginPage.clickOnNext();
		this.loginPage.setUserName(testDataProp.getProperty("username.text"));
		this.loginPage.clickOnNext2();
		this.loginPage.setPassword(testDataProp.getProperty("pass.text"));
		this.loginPage.clickOnLogin();

		logger.info("Ending of signinTwitter method");
	}


}
