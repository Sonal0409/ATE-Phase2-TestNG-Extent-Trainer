package com.phase2.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDemoAssertions {
	/*Different types of Assert
	 * assertEqual() , assertNotEquals()
	 * assertTrue(), asssertFalse()
	 * assertNull(), assertNotNull()
	 * fail()
	 * 
	 */
	
/*	@Test
	public void  method1()
	{
		
		String a1= "selenium";
		String a2 = "tools";
		
		Assert.assertEquals(a1, a2);
	} */
	
	
	/*@Test
	public void  method1()
	{
		
		String a1= "selenium";
		String a2 = "tools";
		
		Assert.assertNotEquals(a1, a2); // test will pass
	} */
	
	/*@Test
	public void  method1()
	{
		
		String a1= "The tool name is Selenium";
		
		
		Assert.assertTrue(a1.contains("Selenium")); // since the sring contains selenium, assert will be true and it will pass
		// contains method returns true
	}*/
	
	
	/*@Test
	public void  method1()
	{
		
		String a1= null;
		
		
		Assert.assertNull(a1); // since the sring is null, assert will be true and it will pass
		
	}*/
	
	/*@Test
	public void  method1()
	{
		
       String a1= null;
		
		
		Assert.assertNotNull(a1); // since the sring is null, assert will be false and it will give error
		
	}*/
	
	
	
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
		  String title = driver.getTitle();
		  String expectedTitle = "Account Login";
		  Assert.assertEquals(title, expectedTitle, "The titles are not matching");
		  
		  //Check if an search box element is displayed or not
		  
		Boolean searchbox=  driver.findElement(By.name("search")).isDisplayed(); // it will return true, so we can apply assertEquals
		 
		Assert.assertTrue(searchbox); // since element is displayed, assert will pass.
		
		if(driver.findElement(By.linkText("MacBook")).isDisplayed())
		{
			Assert.fail("MacBook is displayed, hence failed"); // if the element is displayed we want to fail the test case
		}
	  }
	  
	  
	  

}
