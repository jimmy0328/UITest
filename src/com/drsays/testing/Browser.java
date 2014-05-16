package com.drsays.testing;

import org.openqa.selenium.WebDriver;


public abstract class Browser {

	public WebDriver driver = null;

	public abstract void setUp();

	public abstract void tearDown();
	
	
}
