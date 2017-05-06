package com.klindziuk.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.klindziuk.page.QuestionPage;

public class Footer {
	WebDriver driver;
	public static final By liveInternetLocator = By
			.cssSelector("#footer > p:nth-child(2) > a:nth-child(2) > img:nth-child(1)");
	public static final By feedbackQuestionLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1) > a:nth-child(1)");
	public static final By feedbackErrorMessageLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > a:nth-child(1)");
	public static final By feedbackPublicationLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(5) > td:nth-child(1) > a:nth-child(1)");
	public static final By feedbackLinkExchangeLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(6) > td:nth-child(1) > a:nth-child(1)");
	public static final By mainPageLinkLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(4)");
	public static final By ramblertop100Locator = By.cssSelector("#footer > a:nth-child(3)");
	public static final By serviceDocumentationLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1) > a:nth-child(1)");
	public static final By serviceTestingLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > a:nth-child(1)");
	public static final By serviceConsultingLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(5) > td:nth-child(1) > a:nth-child(1)");

	public Footer(WebDriver driver) {
		this.driver = driver;
	}

	public String getLiveInternetLinkText() {
		return driver.findElement(liveInternetLocator).getText();
	}

	public String getRamblerTop100LinkText() {
		return driver.findElement(ramblertop100Locator).getText();
	}

	public String getFeedBackQuestionLinkText() {
		return driver.findElement(feedbackQuestionLocator).getText();
	}

	public String getFeedBackErrorMessageLinkText() {
		return driver.findElement(feedbackErrorMessageLocator).getText();
	}

	public String getFeedBackPublicationLinkText() {
		return driver.findElement(feedbackPublicationLocator).getText();
	}

	public String getFeedBackLinkExchangeLinkText() {
		return driver.findElement(feedbackLinkExchangeLocator).getText();
	}

	public String getServiceDocumentationLinkText() {
		return driver.findElement(serviceDocumentationLocator).getText();
	}

	public String getServiceTestingPageLinkText() {
		return driver.findElement(serviceTestingLocator).getText();
	}

	public String getServiceConsultingPageLinkText() {
		return driver.findElement(serviceConsultingLocator).getText();
	}

	public String getMainPageLinkText() {
		return driver.findElement(mainPageLinkLocator).getText();
	}

	public void openLiveInternet() {
		driver.findElement(liveInternetLocator).click();
	}

	public void openRamblerTop100Page() {
		driver.findElement(ramblertop100Locator).click();
	}

	public QuestionPage openFeedackQuestionPage() {
		driver.findElement(feedbackQuestionLocator).click();
		return new QuestionPage(driver);
		}

	public void openFeedbackErrorMessagePage() {
		/* Feedback error Message be implemented ASAP */ }

	public void openFeedbackPublicationPage() {
		/* Feedback publication page will be implemented ASAP */ }

	public void openFeedbackLinkExchangePage() {
		/* Feedback link exchange page will be implemented ASAP */ }

	public void openServiceDocumentationPage() {
		/* Service documentation page will be implemented ASAP */ }

	public void openServiceTestingPage() {
		/* Service testing page will be implemented ASAP */ }

	public void openServiceConsultingPage() {
		/* Service consulting page will be implemented ASAP */ }

	public void openMainPage() {
		/* Main page will be implemented ASAP */ }
}
