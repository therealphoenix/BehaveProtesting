package com.klindziuk.regulartest;

import org.testng.annotations.Test;

import com.klindziuk.page.AdminPage;
import com.klindziuk.page.ErrorPage;
import com.klindziuk.page.FacebookPage;
import com.klindziuk.page.MainPage;
import com.klindziuk.page.QuestionPage;
import com.klindziuk.util.BrowserDriver;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class RegularTest {
	WebDriver driver;
	MainPage mainPage;
	QuestionPage questionPage;
	FacebookPage facebookPage;
	AdminPage adminPage;
	ErrorPage errorPage;
	
  
  @BeforeSuite
  public void beforeSuite() {
	  driver = BrowserDriver.CHROME.selectDriver();
	  driver.manage().window().maximize();
	  mainPage = new MainPage(driver);
	 	  
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
	  driver.quit();
	  BrowserDriver.CHROME.killDriver();
  }
  
  @Test
  public void checkTheMainPage_Scenario_1() {
	  driver.get(BrowserDriver.BASEURL);
	  Assert.assertEquals(mainPage.getMainPageTitle(), MainPage.TITLE);
  }
  
  @Test
  public void checkTheContactUsPageFaceBookImageLink_Scenario_2() {
	  driver.get(BrowserDriver.BASEURL);
	  questionPage = mainPage.getFooter().openFeedackQuestionPage();	
	  Assert.assertTrue(questionPage.findFaceBookImageLink());
  }
  
  @Test
  public void checkTheFaceBookPage_Scenario_3() {
	  driver.get(BrowserDriver.BASEURL + "/contact/contact.html");
	  questionPage = new QuestionPage(driver);
	  facebookPage = questionPage.openFacebookPage();
	  Assert.assertEquals(facebookPage.getFacebookpageTitle(), FacebookPage.FACEBOOK_TITLE);
  }
  
  @Test
  public void checkTheAntiHack_Scenario_4() {
	  driver.get(BrowserDriver.BASEURL + "/admin");
	  adminPage = new AdminPage(driver);	
	  Assert.assertEquals(adminPage.findWarningMessage(), AdminPage.WARNING_MESSAGE);
  }
  
  @Test
  public void checkTheErrorPage_Scenario_5() {
	  driver.get(BrowserDriver.BASEURL + "/tottenhamHotspur");
	  errorPage = new ErrorPage(driver);	
	  Assert.assertEquals(errorPage.getErrorMessage(), ErrorPage.ERROR_MESSAGE);
  }
}
