package com.phase2.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	WebDriver driver ;
	
	@BeforeMethod
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
	  
	  @Test(priority='2')
	  public void Register() throws InterruptedException {
		
		  driver.findElement(By.linkText("My Account")).click();
		  driver.findElement(By.linkText("Login")).click();  
		  driver.findElement(By.id("input-email")).sendKeys("seleniumdemo@gmail.com");
		  driver.findElement(By.id("input-password")).sendKeys("123456");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  Thread.sleep(1500);
		  WebElement e1 = driver.findElement(By.xpath("//*[@class='nav navbar-nav']/descendant::a[1]"));
		  Actions a = new Actions(driver);
		  a.moveToElement(e1).build().perform();
		  Thread.sleep(1500);
		  driver.findElement(By.linkText("Mac (1)")).click();
		  
	  }
	  
	  
	  @Test(priority='3')
	  public void Logout() throws InterruptedException
	  {

		  driver.findElement(By.linkText("My Account")).click();
		  driver.findElement(By.linkText("Login")).click();  
		  driver.findElement(By.id("input-email")).sendKeys("seleniumdemo@gmail.com");
		  driver.findElement(By.id("input-password")).sendKeys("123456");
		  driver.findElement(By.xpath("//input[@value='Login']")).click();
		  Thread.sleep(1500);
		  driver.findElement(By.linkText("Logout")).click();
		
	  }
	  
	  @AfterMethod
	  public void tearDown()
	  {
		  driver.close();
	  }

}
