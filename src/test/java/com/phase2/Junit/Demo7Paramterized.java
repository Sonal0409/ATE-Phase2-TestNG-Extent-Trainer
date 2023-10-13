package com.phase2.Junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Demo7Paramterized {
	
	
	// ***********Parameterization using ValueSource****************
	
	@ParameterizedTest(name ="{index} - Run test with args = {0}")
	@ValueSource(ints = {1,4,5,6,7})
	public void valueSourceTest(int args)
	{
		System.out.println("the integer value is " + args);
	}

	@ParameterizedTest(name ="{index} - Run test with args = {0}")
	@ValueSource(strings = {"QTP","Selenium", "Jmeter"})
	public void valueSourceTest2(String args)
	{
		System.out.println("the String value is " + args);
	}
	
	//*********************enumsource *****************
	
	enum plang{
		java, python,ruby,perl;
	}
	@ParameterizedTest
	@EnumSource(plang.class)
	public void enumsource(plang language)
	{
		System.out.println("The language is " + language);
	}
	
	// ************* MethodSource ****************
	
	public static Object[] values()
	{
		return new Object[][] {
			{"selenium","testingtool"},
			{"jmeter","performance"},
			{"QTP","functional"},
			{"Appium","mobileTesting"},
		};
	}
	
	@ParameterizedTest
	@MethodSource("values")
	public void methodsourceTest(String tool, String type)
	{
		System.out.println("The tool is " + tool+ " " + "of type" + type);
	}
	
	// ****************using CSV as a source ***************
	
	
	@ParameterizedTest
	@CsvSource({ "selenium,testingtool",
		"jmeter,performance",
		"QTP,functional",
		"Appium, mobile"})
	public void csvsourceTest(String tool, String type)
	{
		System.out.println("The tool is " + tool+ " " + "of type" + type);
	}
	

}
