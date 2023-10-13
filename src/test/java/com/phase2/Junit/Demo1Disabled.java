package com.phase2.Junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Disabled ("Fucntionality not working so skip the test cases")
public class Demo1Disabled {
	
	@DisplayName("add posive numbers")
	@Test
	public void testadd()
	{
		Calculator obj = new Calculator();
		int sum =obj.add(10, 20);
		System.out.println(sum);
	}

	@DisplayName("add negative numbers")
	@Test
	@Disabled   // this method will be skipped .. not executed
	public void testadd2()
	{
		Calculator obj = new Calculator();
		int sum =obj.add(-10, -20);
		System.out.println(sum);
	}
	
	@Test // private method cannot  be executed in junit 5
	private void testadd3()
	{
		Calculator obj = new Calculator();
		int sum =obj.add(-10, -20);
		System.out.println(sum);
	}

}
