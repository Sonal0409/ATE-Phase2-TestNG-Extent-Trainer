package com.phase2.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDemoParameter {
	
WebDriver driver ;
	


	@Parameters("url")
	@BeforeClass
	public void SetUp(String url)
	{
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
	}
	

	@Parameters({"email","password"})
	  @Test(priority='1')
	  public void myAccount(String email, String password) {
		 
		  driver.findElement(By.linkText("My Account")).click();
		  driver.findElement(By.linkText("Login")).click();  
		  driver.findElement(By.id("input-email")).sendKeys(email);
		  driver.findElement(By.id("input-password")).sendKeys(password);
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
	  }
	  
	  
	  
	  @Test(priority='2')
	  public void Logout() throws InterruptedException
	  {

		  driver.findElement(By.linkText("My Account")).click();
		  Thread.sleep(1500);
		  driver.findElement(By.linkText("Logout")).click();
		
	  }
	  
	  @AfterClass
	  public void tearDown()
	  {
		  driver.close();
	  }


}
