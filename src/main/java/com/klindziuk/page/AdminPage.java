package com.klindziuk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AdminPage extends BasePage{
	WebDriver driver;
	public static final String WARNING_MESSAGE = "И? Нашёл, что искал?";
	public static By messageLocator = By.cssSelector("#content > p > font");

	public AdminPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public String findWarningMessage(){
		return driver.findElement(messageLocator).getText();
	}

}
