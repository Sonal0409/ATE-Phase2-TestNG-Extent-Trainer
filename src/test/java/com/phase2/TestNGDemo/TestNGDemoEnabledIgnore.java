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

public class TestNGDemoEnabledIgnore {
	
	//enabled = true is set by default for each test method
	// enabled is given only to test methods
	//enabled=false, test will not be executed
	// we cna slo use @ignore annotation also
	
	
	WebDriver driver ;
	
	@BeforeClass
	public void SetUp()
	{
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://tutorialsninja.com/demo/");
	}
	
	  @Test(priority='1',enabled=false) // test will not run as enabled = false
	  public void myAccount() {
		 
		  driver.findElement(By.linkText("My Account")).click();
		  driver.findElement(By.linkText("Login")).click();  
		  driver.findElement(By.id("input-email")).sendKeys("seleniumdemo@gmail.com");
		  driver.findElement(By.id("input-password")).sendKeys("123456");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
	  }
	  
	  @Test(priority='2', enabled=true) // this will run , by default
	  public void Register() throws InterruptedException {
		
	
		  Thread.sleep(1500);
		  WebElement e1 = driver.findElement(By.xpath("//*[@class='nav navbar-nav']/descendant::a[1]"));
		  Actions a = new Actions(driver);
		  a.moveToElement(e1).build().perform();
		  Thread.sleep(1500);
		  driver.findElement(By.linkText("Mac (1)")).click();
		  
	  }
	  
	  @Ignore  // this test will not run and will be ignored
	  @Test(priority='3')
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
