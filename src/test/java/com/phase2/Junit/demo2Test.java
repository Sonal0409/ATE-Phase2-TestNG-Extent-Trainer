package com.phase2.Junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class demo2Test {
	
	// Assertions
	
	@Test
	
	public void testAssertions()
	{
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String [] expectedarry = {"one","two","three"};
		String [] actualarray = {"one","two","three"};
		
		assertEquals(str1,str2);
		assertTrue(val1<val2);
		assertNotNull(str1);
		assertNull(str3);
		assertSame(str4,str5);
		
		assertNotSame(str1,str3);
		assertArrayEquals(expectedarry,actualarray);
		
		
		
		
	}
	

}
