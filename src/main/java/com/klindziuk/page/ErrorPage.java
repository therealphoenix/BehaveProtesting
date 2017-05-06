package com.klindziuk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ErrorPage extends BasePage {

	WebDriver driver;
	public static final String ERROR_MESSAGE = "Запрошенная Вами страница не найдена.";
	public static By errorMessageLocator = By.cssSelector("#content > h1");
	public static By feedBackLocator = By.cssSelector("#content > p:nth-child(2) > a");
	public static By mainPageLinkLocator = By.cssSelector("#content > p:nth-child(4) > a");
	

	public ErrorPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public String getErrorMessage() {
		return driver.findElement(errorMessageLocator).getText();
	}

}
