package com.klindziuk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPage extends BasePage {

	WebDriver driver;
	public static final By basicConceptsLocator = By.cssSelector("");
	public static final By loadTestingLocator = By.cssSelector("a.nav:nth-child(2)");
	public static final By automationFuncLocator = By.cssSelector("a.nav:nth-child(3)");
	public static final By practiceLocator = By.cssSelector("a.nav:nth-child(4)");
	public static final By toBookMarksLocator = By.cssSelector("#bookmarkLink");
	public static final By toUpLocator = By.cssSelector(".linktop > a:nth-child(1)");

	public AutomationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public String getBasicsConceptsLinkText() {
		return driver.findElement(basicConceptsLocator).getText();
	}

	public String getLoadTestingLinkText() {
		return driver.findElement(loadTestingLocator).getText();
	}

	public String getAutomationLinkText() {
		return driver.findElement(automationFuncLocator).getText();
	}

	public String practiceLinkText() {
		return driver.findElement(practiceLocator).getText();
	}

	public String toBookMarkStringText() {
		return driver.findElement(toBookMarksLocator).getText();
	}

	public String toUpLinkText() {
		return driver.findElement(toUpLocator).getText();
	}

	public void addToBookMark() {
		driver.findElement(toBookMarksLocator).click();
	}

	public void toUp() {
		driver.findElement(toUpLocator).click();
	}

	public void openBasicConceptsTab() {
		/* Basic concepts tab will be implemented ASAP */ }

	public void openLoadTestingTab() {
		/* Load Testing tab will be implemented ASAP */ }

	public void openAutomationTab() {
		/* AutomationPage tab be implemented ASAP */ }

	public void openPracticeTab() {
		/* Practice tab will be implemented ASAP */ }
}
