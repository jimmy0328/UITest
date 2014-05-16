package com.drsays.testing;

import org.openqa.selenium.WebDriver;

public abstract class TestCase {

	public Browser browser;
	public WebDriver driver = null;

	public void run(Browser b) throws InterruptedException {
		b.setUp();
		this.browser = b;
		this.driver = b.driver;
		build();
		browser.tearDown();
	}

	public abstract void build() throws InterruptedException;
}
