package com.twitter.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	private static final Logger logger = Logger.getLogger(LoginPage.class.getName());

	@FindBy(xpath = "//div[@class='css-901oao r-1awozwy r-1cvl2hr r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")
	private WebElement btnSignin;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n'])[7]")
	private WebElement lblText;

	@FindBy(xpath = "//input[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-t60dpp r-1dz5y72 r-fdjqy7 r-13qz1uu']")
	private WebElement txtEmail;

	@FindBy(xpath = "(//div[@dir='auto'])[7]")
	private WebElement btnNext;

	@FindBy(xpath = "//input[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-t60dpp r-1dz5y72 r-fdjqy7 r-13qz1uu']")
	private WebElement txtUserName;

	@FindBy(xpath = "//div[@class='css-18t94o4 css-1dbjc4n r-sdzlij r-1phboty r-rs99b7 r-19yznuf r-64el8z r-1ny4l3l r-1dye5f7 r-o7ynqc r-6416eg r-lrvibr']")
	private WebElement btnNext2;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement txtPassword;

	@FindBy(xpath = "(//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[1]")
	private WebElement btnLogin;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// public void scrollDown() throws InterruptedException {
	// Thread.sleep(1000);
	// this.scrollDown(200);

	// }

	public void clickOnSignin() throws InterruptedException {
		logger.info("Starting of clickOnSignin method");

		Thread.sleep(3000);
		this.btnSignin.click();

		logger.info("Ending of clickOnSignin method");

	}

	public String getSignInToTwitter() throws InterruptedException {
		logger.info("Starting of getSignInToTwitter method");

		Thread.sleep(3000);

		this.explicitWait(lblText);

		logger.info("Ending of getSignInToTwitter method");
		return lblText.getText();
	}


	public void setEmail(String email) throws InterruptedException {
		logger.info("Starting of setEmail method");

		Thread.sleep(5000);

		this.txtEmail.click();
		this.txtEmail.sendKeys(email);

		logger.info("Ending of setEmail method");
	}

	public void clickOnNext() throws InterruptedException {
		logger.info("Starting of clickNext method");

		Thread.sleep(3000);
		this.btnNext.click();

		logger.info("Ending of clickNext method");

	}

	public void setUserName(String username) throws InterruptedException {
		logger.info("Starting of setUserName method");

		Thread.sleep(3000);

		this.txtUserName.click();
		this.txtUserName.sendKeys(username);

		logger.info("Ending of setUserName method");
	}

	public void clickOnNext2() throws InterruptedException {
		logger.info("Starting of clickNext2 method");

		Thread.sleep(3000);
		this.btnNext2.click();

		logger.info("Ending of clickNext2 method");
	}

	public void setPassword(String password) throws InterruptedException {
		logger.info("Starting of setPassword method");

		Thread.sleep(3000);

		this.txtPassword.click();
		this.txtPassword.sendKeys(password);

		logger.info("Ending of setPassword method");
	}

	public void clickOnLogin() throws InterruptedException {
		logger.info("Starting of clickLogin2 method");

		Thread.sleep(3000);
		this.btnLogin.click();

		logger.info("Ending of clickLogin2 method");
	}


}
