package com.klindziuk.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMenu {
	WebDriver driver;
	public static final By mainLocator = By.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)");
	public static final By qualityAssuranceLocator = By
			.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)");
	public static final By testingLocator = By.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)");
	public static final By automationLocator = By
			.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)");
	public static final By serviceLocator = By.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)");
	public static final By contactLocator = By.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)");
	public static final By newsLocator = By.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(7) > a:nth-child(1)");
	public static final By blogspotLocator = By.cssSelector("#followme > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)");
	public static final By rssLocator = By.cssSelector("#followme > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)");
	public static final By twitterLocator = By.cssSelector("#followme > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)");

	public MainMenu(WebDriver driver) {
		this.driver = driver;
	}

	// get default background
	public String getQAElementBackground() {
		return driver.findElement(qualityAssuranceLocator).getCssValue("background");
	}

	public String moveToQAandClick() {
		System.setProperty("webdriver.chrome.driver", "D:/Java/Chrome/chromedriver.exe");
		driver.manage().window().maximize();
		// waiting for page load
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOfElementLocated(qualityAssuranceLocator));
		// find element
		WebElement element = driver.findElement(qualityAssuranceLocator);
		// performing action
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click(element).perform();
		// waiting for page load after click
		WebDriverWait waitAfterClick = new WebDriverWait(driver, 2);
		waitAfterClick.until(ExpectedConditions.visibilityOfElementLocated(qualityAssuranceLocator));
		return driver.findElement(qualityAssuranceLocator).getCssValue("background");
	}

	public String getMainPageGetLinkText() {
		return driver.findElement(mainLocator).getText();
	}

	public String qaPagePageGetLinkText() {
		return driver.findElement(qualityAssuranceLocator).getText();
	}

	public String testingPageGetLinkText() {
		return driver.findElement(testingLocator).getText();
	}

	public String automationPageGetLinkText() {
		return driver.findElement(automationLocator).getText();
	}

	public String servicePageGetLinkText() {
		return driver.findElement(serviceLocator).getText();
	}

	public String contactPageGetLinkText() {
		return driver.findElement(contactLocator).getText();
	}

	public String newsPageGetLinkText() {
		return driver.findElement(newsLocator).getText();
	}

	public String blogspotGetLinkText() {
		return driver.findElement(blogspotLocator).getText();
	}

	public String rssGetLinkText() {
		return driver.findElement(rssLocator).getText();
	}

	public String twitterGetLinkText() {
		return driver.findElement(twitterLocator).getText();
	}

	public void openMainPage() {
		/* Main page will be implemented ASAP */ }

	public void openQAPage() {
		/* QA will be implemented ASAP */ }

	public void openTestingPage() {
		/* Testing page will be implemented ASAP */ }

	public void openAutomationPAge() {
		/* AutomationPage page will be implemented ASAP */ }

	public void openServicePage() {
		/* Service page will be implemented ASAP */ }

	public void openContactPage() {
		/* Contact page will be implemented ASAP */ }

	public void openBlogspotPage() {
		driver.findElement(blogspotLocator).click();
	}

	public void openRssPage() {
		driver.findElement(rssLocator).click();
	}

	public void openTwitterPage() {
		driver.findElement(twitterLocator).click();
	}
}
