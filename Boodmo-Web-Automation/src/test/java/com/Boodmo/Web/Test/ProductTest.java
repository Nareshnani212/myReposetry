package com.Boodmo.Web.Test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Boodmo.Web.Pages.LoginPage;
import com.Boodmo.Web.Pages.ProductPage;

public class ProductTest extends BaseTest {
	private static final Logger logger = Logger.getLogger(LoginTest.class.getName());

	private WebDriver driver = null;

	private LoginPage loginPage = null;

	private ProductPage productpage = null;

	@BeforeClass
	public void initClass() {
		logger.info("Starting of initClass method");

		this.driver = this.getDriver();
		this.goToSite();
		this.loginPage = new LoginPage(driver);
		this.productpage = new ProductPage(driver);

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

		// String loginText = this.loginPage.getMyAccountText();
		// Assert.assertEquals(loginText,
		// expectedassertionsprop.getProperty("account.text"));

		logger.info("Ending of testLogin method");
	}

	@Test(priority = 2)
	public void testProduct() {
		logger.info("Starting of testProduct method");

		try {

			this.productpage.setProduct(testDataProp.getProperty("product.text"));
			this.productpage.clickOnSearchButton();
			this.productpage.clickOnEngineOilType();
			this.productpage.clickOnSelectedProduct();
			this.productpage.clickOnAddToCart();
			int i = 1;
			while (i < 5) {
				this.productpage.clickOnQuantity();
				i++;
			}
			this.productpage.clickOnProceedToCheckOut();
			this.productpage.clickOnProceed();
			this.productpage.clickOnContinue();
			this.productpage.clickOnPlaceOrder();

		} catch (Exception e) {

			e.printStackTrace();
		}

		logger.info("Ending of testProduct method");
	}

	@Test(priority = 3)
	public void testPayment() {
		logger.info("Starting of testPayment method");

		try {
			this.productpage.clickOnDebitCard();
			this.productpage.setCardNumber(testDataProp.getProperty("cardno.text"));
			this.productpage.setExpiryMonth(testDataProp.getProperty("month.text"));
			this.productpage.setExpiryYear(testDataProp.getProperty("year.text"));
			this.productpage.setCVV(testDataProp.getProperty("cvv.text"));

		} catch (Exception e) {

			e.printStackTrace();
		}

		logger.info("Ending of testPayment method");
	}


	@AfterClass
	public void testLogout() {
		logger.info("Starting of testLogout method");
		try {
			this.productpage.clickOnCancelPopUp();
			this.productpage.clickOnCancelPaytmPopup();
			this.productpage.clickOnHomeHeader();
			this.productpage.clickOnLogoutButton();
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.quit();

		logger.info("Ending of testLogout method");
	}
}
