package com.Boodmo.Web.Pages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BasePage {
	protected WebDriver driver = null;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private static final Logger logger = Logger.getLogger(BasePage.class.getName());

	public static String TEST_FILE_PATH = null;

	public void BaseClassplusAutomationPage(WebDriver driver) {
		this.driver = driver;

		if (TEST_FILE_PATH == null) {

			TEST_FILE_PATH = getTestFilePath();

			logger.debug("In Constructor " + TEST_FILE_PATH);
		}

		PageFactory.initElements(driver, this);
	}

	public String getTestFilePath() {
		String path = "src/test/resources";

		File file = new File(path);
		return file.getAbsolutePath();
	}

	public void switchToIframe(WebElement element) {
		logger.info("Starting of switchToIframe method");

		driver.switchTo().frame(element);

		logger.info("Ending of switchToIframe method");
	}

	public void scrollDown(int scroll) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, " + scroll + ")");

	}

	public void mouseHover(WebElement element) {

		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	public void clickOnWebElement(WebElement webelement) {

		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].click();", webelement);

	}

	public void scrollIntoView(WebElement element) {

		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public void explicitWait(WebElement categoryOptions) {
		logger.info("Staritng of explicitWait method");

		WebDriverWait wait = new WebDriverWait(driver, 45);
		wait.until(ExpectedConditions.visibilityOf(categoryOptions));

		logger.info("Ending of explicitWait method");
	}

	public void switchToNewWindow() {


		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));


	}

	public void screenShot() throws IOException {

		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
				.takeScreenshot(driver);

		ImageIO.write(screenshot.getImage(), "jpg", new File("./Screenshots/img2.jpg"));

		logger.info("Starting of switchToNewWindow method");
	}

}
