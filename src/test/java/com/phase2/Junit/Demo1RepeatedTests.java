package com.phase2.Junit;

import org.junit.jupiter.api.RepeatedTest;

public class Demo1RepeatedTests {

	
	//@Test
		@RepeatedTest(3)
		public void repattestDemo()
		{
			System.out.println("Repeating the tests again");
			
		}
}
