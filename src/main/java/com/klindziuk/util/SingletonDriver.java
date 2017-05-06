package com.klindziuk.util;

import org.openqa.selenium.WebDriver;


public class SingletonDriver {
    private static SingletonDriver instance;
    private WebDriver driver;

    public static SingletonDriver getInstance() {
        if (instance == null) {
            instance = new SingletonDriver();        }
        return instance;
    }

    private SingletonDriver () {
        driver = BrowserDriver.CHROME.selectDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static  void destroy() {
    	BrowserDriver.CHROME.killDriver();
        instance = null;
    }
}
