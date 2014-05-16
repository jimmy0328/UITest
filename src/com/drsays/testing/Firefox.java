package com.drsays.testing;

import junit.framework.TestCase;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox extends Browser {

	@Override
	public void setUp() {
		driver = new FirefoxDriver();

	}

	@Override
	public void tearDown() {
		driver.quit();
	}


}
