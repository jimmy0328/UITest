package com.drsays.testing;

import org.openqa.selenium.safari.SafariDriver;

public class Safari extends Browser {

	@Override
	public void setUp() {
		driver = new SafariDriver();

	}

	@Override
	public void tearDown() {
		driver.quit();
	}

}
