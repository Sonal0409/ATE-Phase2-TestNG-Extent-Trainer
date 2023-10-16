package com.phase2.Junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;

//@IncludeTags("development")
@ExcludeTags("development")
public class Demo11IncludeExcludetags {
	
	
	@DisplayName("add posive numbers")
	@Test
	@Tag("development")
	public void testadd()
	{
		Calculator obj = new Calculator();
		int sum =obj.add(10, 20);
		System.out.println(sum);
	}

	@DisplayName("add negative numbers")
	@Test
	@Tag("production")
	public void testadd2()
	{
		Calculator obj = new Calculator();
		int sum =obj.add(-10, -20);
		System.out.println(sum);
	}
	
	@Test 
	@Tag("development")
	private void testadd3()
	{
		Calculator obj = new Calculator();
		int sum =obj.add(-10, -20);
		System.out.println(sum);
	}
	
	

}
