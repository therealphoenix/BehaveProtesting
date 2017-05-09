package com.klindziuk.pageelements;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
	
	WebDriver driver;
	public static final By mainSignLocator = By.cssSelector(
			"#sitename > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)");

	public Header(WebDriver driver) {
		this.driver = driver;
	}

	public void openMainPage()
	{/* will be implemented ASAP */ }

	public String getMainSingLinkText() {
		return driver.findElement(mainSignLocator).getText();
	}
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("d");
		set.add("c");
		set.add("b");
		System.out.println(set.remove(1));
		System.out.println(set);
	}
}
