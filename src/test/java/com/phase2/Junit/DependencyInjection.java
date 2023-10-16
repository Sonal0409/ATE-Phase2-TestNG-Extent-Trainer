package com.phase2.Junit;

import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class DependencyInjection {
	
	// injection Test dependeny in the test method
	
		@org.junit.jupiter.api.RepeatedTest(5)
		public void repattestDemo(TestInfo testInfo , RepetitionInfo repInfo)
		{
			System.out.println(testInfo.getDisplayName() + " " + repInfo.getCurrentRepetition());
			
		}

}
