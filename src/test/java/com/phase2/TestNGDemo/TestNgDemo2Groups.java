package com.phase2.TestNGDemo;

import org.testng.annotations.Test;

public class TestNgDemo2Groups {
	
	
	@Test(priority='1',groups= {"smoke","functional","Regression"})
	public void Login()
	{
		System.out.println("Successfully logeed in the mailbox");
	}
	
	@Test(priority='2',groups= {"functional"})
	public void LoginwithInValidCredentials()
	{
		System.out.println("Wrong credentials given in the Mailbox");
	}
	
	@Test(priority='3',groups= {"functional"})
	public void SearcMail()
	{
		System.out.println("Successfully found email");
	}
	
	@Test(priority='4',groups= {"Regression","functional"})
	public void Compose()
	{
		System.out.println("Successfully composed a mail");
	}

	
	@Test(priority='5',groups= {"functional"})
	public void DeleteEmail()
	{
		System.out.println("Deleted email");
	}
	
	@Test(priority='1',groups= {"smoke","functional","Regression"})
	public void logout()
	{
		System.out.println("Successfully logged out of mailbox");
	}

}
