package com.phase2.Junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Demo1BeforeAfterEach {
	
	JavaOperations javaoperations;
	
	@BeforeEach
	public void init()
	{
		
		// it is a new class. so select option to create a class.
		//Instead of wriitng this object in every class, we can write it in a init method with @beforeeach annotation
		// we cna create the object a global also, so as to use in all methods
		javaoperations = new JavaOperations();
		System.out.println("Initialization done");
	}
	
	@Test
	public void addTest()
	{
		System.out.println("First Test...using JavaOperations");
	}
	
	@Test
	public void multiplyTest()
	{
		System.out.println("Second Test...using JavaOperations");
	}
	
	@AfterEach
	public void teardown()
	{
		System.out.println("Close Db connection");
	}
	

}
