package com.Boodmo.Web.Test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Boodmo.Web.Pages.LoginPage;

public class LoginTest extends BaseTest {
	private static final Logger logger = LogManager.getLogger(LoginTest.class.getName());

	private WebDriver driver = null;

	private LoginPage loginPage = null;

	@BeforeClass
	public void initClass() {
		logger.info("Starting of initClass method");

		this.driver = this.getDriver();
		this.goToSite();
		this.loginPage = new LoginPage(driver);

		logger.info("Ending of initClass method");
	}

	@Test(priority = 1)
	public void testLogin() {
		logger.info("Starting of testLogin method");

		try {

			this.loginPage.clickOnlogin();
			this.loginPage.setEmail(testDataProp.getProperty("email.text"));
			this.loginPage.setPassword(testDataProp.getProperty("pass.text"));
			this.loginPage.clickOnloginButton();

		} catch (Exception e) {

			e.printStackTrace();
		}

		String loginText = this.loginPage.getMyAccountText();
		Assert.assertEquals(loginText, expectedassertionsprop.getProperty("account.text"));

		logger.info("Ending of testLogin method");
	}

	@AfterClass
	public void quitDriver() {
		logger.info("Starting of quitDriver method");

		driver.quit();

		logger.info("Starting of quitDriver method");
	}
}
