package com.Boodmo.Web.Pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

	@FindBy(xpath = "//input[@type='search']")
	private WebElement txtSearch;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSearch;

	@FindBy(xpath = "//img[@title='10W-30 Engine Oil']")
	private WebElement btn10w30;

	@FindBy(xpath = "(//img[@class='lazy-load-images__image  ng-star-inserted ng-lazyloaded'])[4]")
	private WebElement btnProduct;

	@FindBy(xpath = "//button[@class='part-info-buttons__item btn ng-tns-c107-2']")
	private WebElement btnAddToCart;

	@FindBy(xpath = "//span[@class='quantity-form__button quantity-form__button--plus']")
	private WebElement btnQntyPlus;

	@FindBy(xpath = "//button[@class='btn btn-block']")
	private WebElement btnProceedTochk;

	@FindBy(xpath = "//button[@class='btn btn-block']")
	private WebElement btnProceed;

	@FindBy(xpath = "//span[@class='btn btn-block review-total__action__button']")
	private WebElement btnContinue;

	@FindBy(xpath = "//button[@class='btn btn-block pay__action__button']")
	private WebElement btnPlaceOrder;

	@FindBy(xpath = "//div[@class='ptm-pay-method-cont ']")
	private WebElement btncard;

	@FindBy(xpath = "//iframe[@class='ptm-card-iframe  ']")
	private WebElement iframe;

	@FindBy(xpath = "//input[@id='cardNumber']")
	private WebElement txtcardNo;

	@FindBy(xpath = "//input[@id='cardExpirationMonth']")
	private WebElement txtExpMonth;

	@FindBy(xpath = "//input[@id='cardExpirationYear']")
	private WebElement txtExpYear;

	@FindBy(xpath = "//input[@id='cvv']")
	private WebElement txtCVV;

	@FindBy(xpath = "//div[@class='ptm-close-wrap ptm-pos-a ptm-nav-back']")
	private WebElement cancelPayPopup;

	@FindBy(xpath = "(//span[@id='app-close-btn'])[2]")
	private WebElement btnCancelPtmPopup;

	@FindBy(xpath = "//span[@class='header-button-menu']")
	private WebElement btnHome;

	@FindBy(xpath = "//span[@class='sidenav__menu__logout']")
	private WebElement btnLogout;

	private static final Logger logger = LogManager.getLogger(ProductPage.class.getName());

	public ProductPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void setProduct(String product) throws InterruptedException {
		logger.info("Starting of setProduct method");

		Thread.sleep(3000);

		this.txtSearch.click();
		this.txtSearch.sendKeys(product);

		logger.info("Ending of setProduct method");
	}

	public void clickOnSearchButton() throws InterruptedException {
		logger.info("Starting of clickOnSearchButton method");

		Thread.sleep(3000);

		try {
			this.btnSearch.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnSearch);
		}

		logger.info("Ending of clickOnSearchButton method");
	}

	public void clickOnEngineOilType() throws InterruptedException {
		logger.info("Starting of clickOnEngineOilType method");

		Thread.sleep(3000);

		try {
			this.btn10w30.click();
		} catch (Exception e) {
			this.clickOnWebElement(btn10w30);
		}

		logger.info("Ending of clickOnEngineOilType method");
	}

	public void clickOnSelectedProduct() throws InterruptedException {
		logger.info("Starting of clickOnEngineOilType method");

		Thread.sleep(3000);
		this.scrollDown(420);
		Thread.sleep(2000);

		try {
			this.btnProduct.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnProduct);
		}

		this.switchToNewWindow();

		logger.info("Ending of clickOnEngineOilType method");
	}

	public void clickOnAddToCart() throws InterruptedException {
		logger.info("Starting of clickOnAddToCart method");

		Thread.sleep(3000);
		this.scrollIntoView(btnAddToCart);
		Thread.sleep(2000);

		try {
			this.btnAddToCart.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnAddToCart);
		}

		this.switchToNewWindow();

		logger.info("Ending of clickOnAddToCart method");
	}

	public void clickOnProceedToCheckOut() throws InterruptedException {
		logger.info("Starting of clickOnProceedToCheckOut method");

		Thread.sleep(3000);
		this.scrollIntoView(btnProceedTochk);
		Thread.sleep(2000);

		try {
			this.btnProceedTochk.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnProceedTochk);
		}

		logger.info("Ending of clickOnProceedToCheckOut method");
	}

	public void clickOnProceed() throws InterruptedException {
		logger.info("Starting of clickOnProceed method");

		Thread.sleep(3000);
		this.scrollIntoView(btnProceed);
		Thread.sleep(2000);

		try {
			this.btnProceed.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnProceed);
		}

		logger.info("Ending of clickOnProceed method");
	}

	public void clickOnContinue() throws InterruptedException {
		logger.info("Starting of clickOnContinue method");

		Thread.sleep(3000);
		this.scrollIntoView(btnContinue);
		Thread.sleep(2000);

		try {
			this.btnContinue.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnContinue);
		}
		Thread.sleep(3000);

		logger.info("Ending of clickOnContinue method");
	}

	public void clickOnPlaceOrder() throws InterruptedException {
		logger.info("Starting of clickOnPlaceOrder method");

		Thread.sleep(3000);
		try {
			this.btnPlaceOrder.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnPlaceOrder);
		}
		Thread.sleep(3000);

		logger.info("Ending of clickOnPlaceOrder method");
	}

	public void clickOnDebitCard() throws InterruptedException {
		logger.info("Starting of clickOnDebitCard method");

		Thread.sleep(3000);
		this.scrollIntoView(btncard);
		Thread.sleep(3000);
		try {
			this.btncard.click();
		} catch (Exception e) {
			this.clickOnWebElement(btncard);
		}

		logger.info("Ending of clickOnDebitCard method");
	}

	public void setCardNumber(String card) throws InterruptedException {
		logger.info("Starting of setCardNumber method");

		Thread.sleep(3000);
		this.switchToIframe(iframe);
		Thread.sleep(2000);
		this.txtcardNo.click();
		this.txtcardNo.sendKeys(card);

		logger.info("Ending of setCardNumber method");
	}

	public void setExpiryMonth(String month) throws InterruptedException {
		logger.info("Starting of setExpiryMonth method");

		Thread.sleep(3000);

		this.txtExpMonth.click();
		this.txtExpMonth.sendKeys(month);

		logger.info("Ending of setExpiryMonth method");
	}

	public void setExpiryYear(String year) throws InterruptedException {
		logger.info("Starting of setExpiryYear method");

		Thread.sleep(3000);

		this.txtExpYear.click();
		this.txtExpYear.sendKeys(year);

		logger.info("Ending of setExpiryYear method");
	}

	public void setCVV(String cvv) throws InterruptedException {
		logger.info("Starting of setCVV method");

		Thread.sleep(3000);

		this.txtCVV.click();
		this.txtCVV.sendKeys(cvv);
		Thread.sleep(5000);

		logger.info("Ending of setCVV method");
	}

	public void clickOnQuantity() throws InterruptedException {
		logger.info("Starting of clickOnPay method");

		Thread.sleep(3000);

		try {
			this.btnQntyPlus.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnQntyPlus);
		}
		Thread.sleep(1000);

		logger.info("Ending of clickOnPay method");
	}

	public void clickOnCancelPopUp() throws InterruptedException {
		logger.info("Starting of clickOnCancelPopUp method");

		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		try {
			this.cancelPayPopup.click();
		} catch (Exception e) {
			this.clickOnWebElement(cancelPayPopup);
		}

		logger.info("Ending of clickOnCancelPopUp method");
	}

	public void clickOnCancelPaytmPopup() throws InterruptedException {
		logger.info("Starting of clickOnCancelPaytmPopup method");

		Thread.sleep(3000);
		this.scrollIntoView(btnCancelPtmPopup);
		Thread.sleep(2000);
		try {
			this.btnCancelPtmPopup.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnCancelPtmPopup);
		}
		Thread.sleep(3000);

		logger.info("Ending of clickOnCancelPaytmPopup method");
	}

	public void clickOnHomeHeader() throws InterruptedException {
		logger.info("Starting of clickOnHomeHeader method");

		Thread.sleep(3000);
		try {
			this.btnHome.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnHome);
		}
		Thread.sleep(1000);

		logger.info("Ending of clickOnHomeHeader method");
	}

	public void clickOnLogoutButton() throws InterruptedException {
		logger.info("Starting of clickOnLogoutButton method");

		Thread.sleep(3000);
		try {
			this.btnLogout.click();
		} catch (Exception e) {
			this.clickOnWebElement(btnLogout);
		}
		Thread.sleep(5000);

		logger.info("Ending of clickOnLogoutButton method");
	}
}
