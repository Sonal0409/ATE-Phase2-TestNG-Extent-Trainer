package com.phase2.Junit;

import java.lang.annotation.Annotation;

public class TestDemoAnnoatation implements DemoAnnotation{

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@DemoAnnotation
	public void devadd()
	{
		System.out.println("add numberS");
	}

}
