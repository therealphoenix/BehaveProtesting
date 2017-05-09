package com.klindziuk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuestionPage extends BasePage {
		
	WebDriver driver;
	By faceBookLinkImage = By.cssSelector("#content > div > a > img");
	
	public QuestionPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	} 
	
	public boolean findFaceBookImageLink(){
		waitFor(faceBookLinkImage);
		return driver.findElements(faceBookLinkImage).size() != 0;
	}
	
	public FacebookPage openFacebookPage() {
		waitFor(faceBookLinkImage);
		driver.findElement(faceBookLinkImage).click();
		return new FacebookPage(driver);
	}
}
