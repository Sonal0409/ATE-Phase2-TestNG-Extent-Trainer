package com.phase2.Junit;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import static org.testng.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class Demo6DymaicTest {
	

	
		private List<String> createInputList(){
			return Arrays.asList("race","mom","dad","test");
		}
		
		
		@TestFactory
		public Stream<DynamicNode> dynamicTestwithDynamicContainer()
		{
			return createInputList().stream()
					.map(input -> 
					   DynamicContainer.dynamicContainer("Container for " + input, Stream.of(
							  dynamicTest("not Null", () -> Assertions.assertNotNull(input)),
					   DynamicContainer.dynamicContainer("properties test", Stream.of(
							   dynamicTest("length > 0", () -> Assertions.assertTrue(input.length() > 0)),
							   dynamicTest("not empty", () -> Assertions.assertFalse(input.isEmpty()))					   				   
							   )
							   )
					   
					   
							   ))
							
							
							);
	
	
				
				
	}

}
