package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		//driver = new FirefoxDriver();
		driver = new SafariDriver();
		baseUrl = "http://autotest.localhost.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testForm() throws Exception {
		driver.get(baseUrl + "/faceToface.html");
		driver.findElement(By.id("admintStaff")).clear();
		driver.findElement(By.id("admintStaff")).sendKeys("Obama");
		driver.findElement(By.id("admitStaffContactNumber")).clear();
		driver.findElement(By.id("admitStaffContactNumber")).sendKeys(
				"8888898887");
		driver.findElement(By.id("commentToPhysician")).clear();
		driver.findElement(By.id("commentToPhysician")).sendKeys("nice");
		new Select(driver.findElement(By.id("AdmitDate_D")))
				.selectByVisibleText("26");
		new Select(driver.findElement(By.id("AdmitDate_Y")))
				.selectByVisibleText("2014");
		new Select(driver.findElement(By.id("AdmitTime_H")))
				.selectByVisibleText("08");
		new Select(driver.findElement(By.id("AdmitTime_I")))
				.selectByVisibleText("17");
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("In-Jio");
		driver.findElement(By.id("inputPassword1")).clear();
		driver.findElement(By.id("inputPassword1")).sendKeys("Ma");
		new Select(driver.findElement(By
				.xpath("(//select[@id='AdmitDate_M'])[2]")))
				.selectByVisibleText("Dec");
		new Select(driver.findElement(By
				.xpath("(//select[@id='AdmitDate_D'])[2]")))
				.selectByVisibleText("19");
		new Select(driver.findElement(By
				.xpath("(//select[@id='AdmitDate_Y'])[2]")))
				.selectByVisibleText("2007");
		driver.findElement(By.id("deferred")).click();
		driver.findElement(By.id("deferred")).click();
		driver.findElement(By.id("male")).click();
		driver.findElement(By.cssSelector("label.checkbox-inline > #deferred"))
				.click();
		driver.findElement(By.id("involuntary")).click();
		driver.findElement(
				By.cssSelector("div.col-lg-3 > div.form-group > div.col-lg-offset-1 > label.checkbox-inline > #deferred"))
				.click();
		driver.findElement(
				By.cssSelector("div.col-lg-2 > div.form-group > div.col-lg-offset-1 > label.checkbox-inline > #refused"))
				.click();
		driver.findElement(By.cssSelector("div.col-lg-5 > input.form-control"))
				.clear();
		driver.findElement(By.cssSelector("div.col-lg-5 > input.form-control"))
				.sendKeys("ugly");
		driver.findElement(By.cssSelector("textarea.form-control")).clear();
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys(
				"drunk");
		driver.findElement(By.cssSelector("div.col-lg-5 > input.form-control"))
				.clear();
		driver.findElement(By.cssSelector("div.col-lg-5 > input.form-control"))
				.sendKeys("ugly face");
		driver.findElement(
				By.cssSelector("div.col-lg-9 > div.checkbox > label > input[type=\"checkbox\"]"))
				.click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[20]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[25]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[26]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[17]")).click();
		driver.findElement(
				By.cssSelector("div.checkbox.col-lg-3  > label > input[type=\"checkbox\"]"))
				.click();
		driver.findElement(By.cssSelector("div.col-lg-9 > input.form-control"))
				.clear();
		driver.findElement(By.cssSelector("div.col-lg-9 > input.form-control"))
				.sendKeys("dumb");
		driver.findElement(By.xpath("//div[16]/div[2]/textarea")).clear();
		driver.findElement(By.xpath("//div[16]/div[2]/textarea")).sendKeys(
				"who knows?");
		driver.findElement(
				By.cssSelector("div.panel-body > div.checkbox > label > input[type=\"checkbox\"]"))
				.click();
		driver.findElement(
				By.cssSelector("div.form-group > div.checkbox.col-lg-1  > label > input[type=\"checkbox\"]"))
				.click();
		driver.findElement(By.xpath("(//input[@value=''])[19]")).click();
		driver.findElement(By.xpath("(//input[@value=''])[24]")).click();
		driver.findElement(By.xpath("(//input[@value=''])[29]")).click();
		driver.findElement(By.xpath("(//input[@value=''])[36]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[57]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[58]")).click();
		driver.findElement(By.xpath("(//input[@value=''])[40]")).click();
		driver.findElement(By.xpath("(//input[@value=''])[51]")).click();
		try {
			assertEquals("GLOBAL FUNCTIONING :",
					driver.findElement(By.xpath("//div[22]/div/h3")).getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.xpath("(//input[@value=''])[66]")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}