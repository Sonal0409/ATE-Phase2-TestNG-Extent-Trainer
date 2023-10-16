package com.phase2.Junit;



import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Demo8ArgumentSourceImplicit {
	
	


@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	void testWithImplicitArgumentConversion(ChronoUnit chronoUnit) {
	  Assertions.assertNotNull(chronoUnit.name());
	}
	

}