package com.phase2.Junit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Demo4Assumptions {
	
	

	@Test
	public void test2()
	{
		//the test should run only if server is up
		// let us assume that our server is down, so valriable is serverup=false
       boolean isServerup=false; 
       // here setting an assumptions that if server is up==>value is true then execute line 48
       //else fail the dont run the test and give error
       Assumptions.assumeTrue(isServerup,"server is not up");
    System.out.println("execute my code program");
	}

}
