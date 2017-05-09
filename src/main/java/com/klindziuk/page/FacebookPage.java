package com.klindziuk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookPage {

	WebDriver driver;
	public static final String FACEBOOK_TITLE = "ПроТестинг - Главная | Facebook";
	static By messageLocator = By.id("composer_text_input_box");
	static By postButtonLocator = By.xpath("//*[@data-intl-translation = 'Post']");
	static By cancelClickLocator = By.id("expanding_cta_close_button");
	static By emailLocator = By.id("email");
	static By passwordLocator = By.id("pass");
	static By loginButtonLocator = By.xpath("//*[@type = 'submit']");

	public FacebookPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getFacebookpageTitle() {
		return driver.getTitle();
	}

	public void setEmail(String email) {
		driver.findElement(emailLocator).sendKeys(email);
	}

	public void setPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}

	public void pushLoginButton() {
		driver.findElement(loginButtonLocator).click();
	}

	public FacebookPage cancelClick() {
		waitFor(cancelClickLocator);
		driver.findElement(cancelClickLocator).click();
		return this;
	}

	public FacebookPage loginAs(String email, String password) {
		setEmail(email);
		setPassword(password);
		pushLoginButton();
		return this;
	}

	public FacebookPage postMessage(String message) {
		driver.findElement(messageLocator).click();
		return this;
	}

	public FacebookPage pushPostButton() {
		driver.findElement(postButtonLocator).click();
		return this;
	}

	public boolean findMessage(String message) {
		return driver.getPageSource().contains(message);
	}

	public void waitFor(By by) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
