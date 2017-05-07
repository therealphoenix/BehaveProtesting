package com.klindziuk.JBehave.step;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.klindziuk.page.AdminPage;
import com.klindziuk.page.ErrorPage;
import com.klindziuk.page.FacebookPage;
import com.klindziuk.page.MainPage;
import com.klindziuk.page.QuestionPage;
import com.klindziuk.util.BrowserDriver;

import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ProtestingSteps {
	WebDriver driver;
	MainPage mainPage;
	QuestionPage questionPage;
	FacebookPage facebookPage;
	AdminPage adminPage;
	ErrorPage errorPage;

	@BeforeStory
	public void storySetup() {
		driver = BrowserDriver.CHROME.selectDriver();
		mainPage = new MainPage(driver);
	}

	/* 
	 * Scenario : check the main page
	 */ 
	@Given("Open the Protesting page")
	public void openMainPage() throws Exception {
		driver.get(BrowserDriver.BASEURL);
	}

	@When("I open the url */*")
	public void openWithSlash() throws Exception {
		driver.get(BrowserDriver.BASEURL + "/");

	}

	@Then("the page *main* is opened")
	public void checkMainPageTitle() throws Exception {
		Assert.assertEquals(mainPage.getMainPageTitle(), MainPage.TITLE);
	}

	/* 
	 * Scenario : check the contact us page
	 */
	@Given("I am on the *main* page")
	public void openMainPageDirectly() throws Exception {
		driver.get(BrowserDriver.BASEURL);
	}

	@When("I click the link *contact us* on the footer")
	public void openContactUsPage() throws Exception {
		questionPage = mainPage.getFooter().openFeedackQuestionPage();

	}

	@Then("*Facebook* image link present")
	public void checkFacebookLink() {
		Assert.assertTrue(questionPage.findFaceBookImageLink());
	}
	
	/* 
	 * Scenario : check the Facebook page
	 */
	@Given("I am on the *contact us* page")
	public void openContactUsPageDirectly() throws Exception {
		driver.get(BrowserDriver.BASEURL + "/contact/contact.html");
	}

	@When("I click the *Facebook* link")
	public void openFacebookPage() throws Exception {
		questionPage = new QuestionPage(driver);
		facebookPage = questionPage.openFacebookPage();
	}

	@Then("the page *Facebook* page is opened")
	public void checkFaceBookTitle() {
		Assert.assertEquals(facebookPage.getFacebookpageTitle(), FacebookPage.FACEBOOK_TITLE);
	}
	
	/* 
	 * Scenario : check the anti-hack page
	 */
	@Given("I am on the **main** page")
	public void openMainPageforAntiHackDirectly() throws Exception {
		driver.get(BrowserDriver.BASEURL);
	}

	@When("I open URL */admin*")
	public void openAdminPage() throws Exception {
		driver.get(BrowserDriver.BASEURL + "/admin");
		adminPage = new AdminPage(driver);
	}

	@Then("the *anti hack* page is opened")
	public void checkWarningMessage() {
		Assert.assertEquals(adminPage.findWarningMessage(), AdminPage.WARNING_MESSAGE);
	}
	
	/* 
	 * Scenario : check the error page
	 */
	@Given("I am on the ***main*** page")
	public void openMainPageforErrorScenario() throws Exception {
		driver.get(BrowserDriver.BASEURL);
	}

	@When("I open url */blahblah*")
	public void openErrorPage() throws Exception {
		driver.get(BrowserDriver.BASEURL + "/blahblah");
		errorPage = new ErrorPage(driver);
	}

	@Then("the *error* page is opened")
	public void checkErrorMessage() {
		Assert.assertEquals(errorPage.getErrorMessage(), ErrorPage.ERROR_MESSAGE);
	}
	

	@AfterStory
	public void afterStory() {
		driver.quit();
	}
}
