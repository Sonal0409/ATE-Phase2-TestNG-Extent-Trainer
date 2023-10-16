package com.phase2.Junit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
public class Demo10ConditionalTest {
	
	/* Condition on OS
	 * Condition on JRE
	 * Condition on JRE range 
	 */
	
	
	@Test
	@EnabledOnOs(OS.MAC)
	public void conditiononOS()
	{
		System.out.println("execute test case on mac");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_10)
	public void conditionJava()
	{
		System.out.println("execute test case on Java10");
	}
	
	@Test  
	@EnabledForJreRange(min = JRE.JAVA_8, max= JRE.JAVA_11)
	public void conditionJavaRange()
	{
		System.out.println("execute test case on Java8 to java 11");
	}
	
	
	@Test  // not working
	@EnabledIfSystemProperty(named = "user.dir" , matches ="C:/Users/sonal/eclipse-workspace/Junit5Demo20Oct")
	public void conditionSystemProperty()
	{
		System.out.println(System.getProperty("user.dir"));
	}
	
	
	
	
	

}
