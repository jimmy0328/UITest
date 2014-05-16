package com.drsays.testing;

import junit.framework.TestCase;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome extends Browser {

	private String driverPath = "/Users/linjimmy/workspace/UITest/driver/chromedriver";

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	}

	public void tearDown() {
		driver.quit();
	}
	
	
}
