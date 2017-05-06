package com.klindziuk.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.klindziuk.util.BrowserDriver;
public class MainPage extends BasePage {
	
	
    WebDriver driver;
    public static final String TITLE = "Про Тестинг: тесты, тестирование и тестировщики программного обеспечения.";
	public static final By QALocator = By.cssSelector("#leftside > p:nth-child(2) > a:nth-child(1)");
	public static final By testingLocator = By.cssSelector("#leftside > p:nth-child(2) > a:nth-child(2)");
	public static final By automationLocator = By.cssSelector("#leftside > p:nth-child(2) > a:nth-child(3)");
	public static final By serviceLocator = By.cssSelector("#leftside > p:nth-child(2) > a:nth-child(4)");
	public static final By contactLocator = By.cssSelector("#leftside > p:nth-child(2) > a:nth-child(5)");
	public static final By recomendationsLocator = By.cssSelector("#leftside > p:nth-child(4) > a");
	
	
	public MainPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public QAPage openQAPage(WebDriver driver){
		driver.findElement(QALocator).click();
		return new QAPage(driver);
	}
	
	public TestingPage openTestingPage(WebDriver driver){
		driver.findElement(testingLocator).click();
		return new TestingPage(driver);
	}
	
	public AutomationPage openAutomationPage(WebDriver driver){
		driver.findElement(automationLocator).click();
		return new AutomationPage(driver);
	}
	
	public ServicePage openServicePage(WebDriver driver){
		driver.findElement(serviceLocator).click();
		return new ServicePage(driver);
	}
	
	public ContactPage openContactPage(WebDriver driver){
		driver.findElement(contactLocator).click();
		return new ContactPage(driver);
	}
	
	public InfoPartnersPage openInfoPartnersPage(WebDriver driver){
		driver.findElement(recomendationsLocator).click();
		return new InfoPartnersPage(driver);
	}
	
	public String getMainPageTitle() {
		return driver.getTitle();
	}
		
	public static void main (String[] args){
		WebDriver driver = BrowserDriver.CHROME.selectDriver();
		MainPage mainPage = new MainPage(driver);
		driver.get("http://protesting.ru/");
		mainPage.getFooter().getFeedBackQuestionLinkText();
	}
	
	}
