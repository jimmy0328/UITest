package com.drsays.testing.unit;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.drsays.testing.TestCase;

public class LoginCase extends TestCase {

	private StringBuffer verificationErrors = new StringBuffer();
	private String baseUrl = "";
	
	@Override
	public void build() throws InterruptedException {
		baseUrl = "http://autotest.localhost.com/";
		driver.get(baseUrl + "/index.php");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("jimmy");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.id("loginBtn")).click();
		try {
			assertEquals(
					"Hi, jimmy",
					driver.findElement(
							By.cssSelector("form.navbar-form.navbar-right > a"))
							.getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.id("saveBtn")).click();
		try {
			assertEquals(
					"你輸入的內容有誤",
					driver.findElement(By.cssSelector("div.alert.alert-danger"))
							.getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("d");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("d");
		driver.findElement(By.id("newPassword")).clear();
		driver.findElement(By.id("newPassword")).sendKeys("d");
		driver.findElement(By.id("saveBtn")).click();
		try {
			assertEquals(
					"儲存成功",
					driver.findElement(
							By.cssSelector("div.alert.alert-success"))
							.getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.id("logoutBtn")).click();
		
		
		

		
	}
	
	

}
