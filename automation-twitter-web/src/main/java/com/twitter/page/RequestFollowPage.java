package com.twitter.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestFollowPage extends BasePage {
	private static final Logger logger = Logger.getLogger(LoginPage.class.getName());

	@FindBy(xpath = "(//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0'])[3]")
	private WebElement lblText1;

	@FindBy(xpath = "//input[@data-testid='SearchBox_Search_Input']")
	private WebElement txtSearch;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	private WebElement txtJrNTR;

	@FindBy(xpath = "(//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0'])[13]")
	private WebElement lblText2;

	@FindBy(xpath = "//div[@class='css-18t94o4 css-1dbjc4n r-42olwf r-sdzlij r-1phboty r-rs99b7 r-2yi16 r-1qi8awa r-1ny4l3l r-ymttw5 r-o7ynqc r-6416eg r-lrvibr']")
	private WebElement btnFollow;

	@FindBy(xpath = "//div[@class='css-1dbjc4n r-obd0qt r-16y2uox']")
	private WebElement btn3DotMenu;

	@FindBy(xpath = "(//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0'])[6]")
	private WebElement btnLogout1;

	@FindBy(xpath = "//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")
	private WebElement btnLogout2;

	public RequestFollowPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public String getHome() throws InterruptedException {
		logger.info("Starting of getHome method");
		Thread.sleep(3000);
		this.explicitWait(lblText1);
		logger.info("Ending of getHome method");
		return lblText1.getText();
	}

	public void setSearch(String search) throws InterruptedException {
		logger.info("Starting of setSearch method");

		Thread.sleep(5000);
		this.txtSearch.click();
		this.txtSearch.sendKeys(search);

		logger.info("Ending  of setSearch method");
	}

	public void clickJrNTR() throws InterruptedException {
		logger.info("Starting of clickJrNTR method");

		Thread.sleep(5000);
		this.txtJrNTR.click();

		logger.info("Ending  of clickJrNTR method");
	}

	public String getJrNtr() throws InterruptedException {
		logger.info("Starting of getJrntr method");

		Thread.sleep(3000);
		this.explicitWait(lblText2);
		logger.info("Ending of getJrntr method");

		return lblText2.getText();
	}

	public void clickOnFollow() throws InterruptedException {
		logger.info("Starting of clickOnFollow method");

		Thread.sleep(5000);
		this.btnFollow.click();

		logger.info("Ending  of clickOnFollow method");
	}

	public void clickOn3DotMenu() throws InterruptedException {
		logger.info("Starting of clickOn3DotMenu method");

		Thread.sleep(5000);
		this.btn3DotMenu.click();

		logger.info("Ending  of clickOn3DotMenu method");
	}

	public void clickOnLogout1() throws InterruptedException {
		logger.info("Starting of clickOnLogout method");

		Thread.sleep(5000);
		this.btnLogout1.click();

		logger.info("Ending  of clickOnLogout method");
	}

	public void clickOnLogout2() throws InterruptedException {
		logger.info("Starting of clickOnLogout method");

		Thread.sleep(5000);
		this.btnLogout2.click();

		logger.info("Ending  of clickOnLogout method");
	}

}
