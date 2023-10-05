package com.phase2.Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class Demo3 {
	
	// Assisted practice 3
	
	@BeforeAll
	public static void beforeAllMethod()
	{
		System.out.println("Starting the connection with DB");
	}

	@AfterAll
	public static void afterAllmethod()
	{
		System.out.println("Stop the connection with DB");
	}
	
	
	@Test
	public void Test1()
	{
		System.out.println("Today");
		
	}
	
	
	@Test
	public void Test2()
	{
		System.out.println("Tomorrow");
		
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Everyone");
		
	}

}
