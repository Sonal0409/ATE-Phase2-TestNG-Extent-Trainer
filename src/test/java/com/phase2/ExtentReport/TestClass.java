package com.phase2.ExtentReport;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestClass extends BaseTest{
	
	
	@Test(testName = "TestGoogle", groups = {"smoke"})
	public void TestGoogle()
	{
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		extentTest.info("Naviagted to URL");
		driver.findElement(By.linkText("Create account")).click();
		String ExpectedTitle = "Createaccount- Wikipedia";
		String actualtitle = driver.getTitle();
		assertEquals(actualtitle,ExpectedTitle,"This title is not correct");
		extentTest.pass("Assertion is passed");
		
		
	}
	
	@Test(testName = "Testfacebook", groups = {"smoke","regression"})
	public void Testfacebook()
	{
		driver.get("https://www.facebook.com/");
		extentTest.info("Naviagted to URL");
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");	
	}


	@Test(testName = "Testrediff", groups = {"sanity"})
	public void Testrediff()
	{
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		extentTest.info("Naviagted to URL");
		driver.findElement(By.id("login1")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("admin@gmail.com");
		
		
	}
	
	

}
