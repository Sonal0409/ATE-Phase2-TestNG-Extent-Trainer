package com.phase2.Junit;



import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class Demo5DynamicTestTestFactory {
	
	
	// @Test annotation will make your test run static in nature.The behavour is defined while writing the code 
	// And the behaviour cannot be chnaged at runtime.
	// For this we need Dynamic tests which is generated at runtime by a factory method that is annotated using @testfactory annotation
	//@TestFactory annotation is not a test cases, it is a factory of test cases, set of test cases
	// A @tetsFactory methods whould return a single dynamic node or Stream or Collection or Iterable iterator 
	//or array of dynamic node instances
	//@TestFactory method cannot be private or a static method
	
	@TestFactory
	Stream<DynamicTest> dynamicTestsForPalindromes()
	{
		return Stream.of("pop","radar","mom","dad","madam").map(inputText -> dynamicTest(inputText,
				()-> Assertions.assertTrue(Myutils.isPalindrome(inputText))));
		
	}
	
	@TestFactory
	Collection<DynamicTest> dynamicTests() {
		return Arrays.asList(
           dynamicTest("simple test", () -> Assertions.assertTrue(true)),
        //   dynamicTest("Executable Class", () -> new MyExecutable()),
           dynamicTest("Exception Executable", () -> {throw new Exception("exception example");}),
           dynamicTest("simple test-2", () -> Assertions.assertTrue(true))
           
			);	

}

}