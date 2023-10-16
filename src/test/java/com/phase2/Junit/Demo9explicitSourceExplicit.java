package com.phase2.Junit;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.AnnotationBasedArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.EnumSource;

public class Demo9explicitSourceExplicit {
	

	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void testCaseWithExplicitArgumentConversion(
	        @ConvertWith(ToStringArgumentConverter.class) String argument) {
 
	    Assertions.assertNotNull(TimeUnit.valueOf(argument));
	}

}
