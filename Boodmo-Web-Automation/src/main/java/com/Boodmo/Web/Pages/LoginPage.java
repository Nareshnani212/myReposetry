package com.Boodmo.Web.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BasePage {

	@FindBy(xpath = "//span[text()=' Log in ']")
	private WebElement btnLogin;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement txtEmail;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement txtPswd;

	@FindBy(xpath = "//button[@class='btn btn-block']")
	private WebElement btnLogin1;

	@FindBy(xpath = "(//a[@class='user-menu__link'])[2]")
	private WebElement myAccount;

	private static final Logger logger = Logger.getLogger(LoginPage.class.getName());

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOnlogin() throws InterruptedException {
		logger.info("Starting of clickOnlogin method");

		Thread.sleep(3000);

		try {
			this.btnLogin.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnLogin);
		}

		logger.info("Starting of clickOnlogin method");
	}

	public void setEmail(String email) throws InterruptedException {
		logger.info("Starting of setEmail method");

		Thread.sleep(3000);

		this.txtEmail.click();
		this.txtEmail.sendKeys(email);

		logger.info("Starting of setEmail method");
	}

	public void setPassword(String pass) throws InterruptedException {
		logger.info("Starting of setPassword method");

		Thread.sleep(3000);

		this.txtPswd.click();
		this.txtPswd.sendKeys(pass);

		logger.info("Starting of setPassword method");
	}

	public void clickOnloginButton() throws InterruptedException {
		logger.info("Starting of clickOnloginButton method");

		Thread.sleep(3000);

		try {
			this.btnLogin1.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnLogin1);
		}
		Thread.sleep(6000);

		logger.info("Ending of clickOnloginButton method");
	}

	public String getMyAccountText() {
		return myAccount.getText();

	}

}
