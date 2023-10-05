package com.phase2.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNgDemoDependsOn {
	
	
	WebDriver driver ;
	
	@BeforeClass
	public void SetUp()
	{
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://tutorialsninja.com/demo/");
	}
	
	
	  @Test(priority='1')
	  public void myAccount() {
		 
		  driver.findElement(By.linkText("My Account")).click();
		  driver.findElement(By.linkText("Login")).click();  
		  driver.findElement(By.id("input-email")).sendKeys("seleniumdemo@gmail.com");
		  driver.findElement(By.id("input-password")).sendKeys("123456");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
	  }
	  
	  @Test(priority='2', dependsOnMethods={"myAccount"}, alwaysRun = true)
	  // even if dependent test is failed, this test will run because of alwaysRun flag
	  // make the locator wring in above test, so that it fails.
	  public void Register() throws InterruptedException {
		
	
		  Thread.sleep(1500);
		  WebElement e1 = driver.findElement(By.xpath("//*[@class='nav navbar-nav']/descendant::a[1]"));
		  Actions a = new Actions(driver);
		  a.moveToElement(e1).build().perform();
		  Thread.sleep(1500);
		  driver.findElement(By.linkText("Mac (1)")).click();
		  
	  }
	  
	  
	  @Test(priority='3', dependsOnMethods={"Register","myAccount"}, alwaysRun = true)
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
