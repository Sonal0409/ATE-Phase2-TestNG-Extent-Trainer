package com.phase2.TestNGDemo;

import org.testng.annotations.Test;

public class TestNgDemoGroups {
	
	@Test(priority='1',groups= {"smoke","functional","Regression"})
	public void LoginwithValidCredentials()
	{
		System.out.println("Successfully logeed in the application");
	}
	
	@Test(priority='2',groups= {"functional"})
	public void LoginwithInValidCredentials()
	{
		System.out.println("Wrong credentials given in the application");
	}
	
	@Test(priority='3',groups= {"functional"})
	public void RegisterAccount()
	{
		System.out.println("Successfully registered");
	}
	
	@Test(priority='4',groups= {"smoke","functional"})
	public void SelectItem()
	{
		System.out.println("Successfully selected the item");
	}

	
	@Test(priority='5',groups= {"functional"})
	public void SelectInvalidItem()
	{
		System.out.println("Item not found");
	}
	
	@Test(priority='1',groups= {"smoke","functional","Regression"})
	public void logout()
	{
		System.out.println("Successfully logged out of application");
	}
	
	
}
