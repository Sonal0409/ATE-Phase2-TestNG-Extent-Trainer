package com.phase2.ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SampleTestCaseReportDemo2 {
	
	// Generate the report with dummy test cases and status

	@Test
	public void extentDemo2() throws IOException {

	ExtentReports ex = new ExtentReports();  // this extent report engine
	
	File file = new File("report1.html");
	ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
	ex.attachReporter(sparkreporter);
	
	// Create a dummy test cases and add pass status
	
	ExtentTest test1 = ex.createTest("Test1");
	test1.pass("Test has passed"); // dummy status
	
	//Create dummy test and add status as Fail using log method

	ExtentTest test2 = ex.createTest("Test2");
	test2.log(Status.FAIL, "This is failed"); // dummy status
	


	//Create dummy test and directly add status as skip
	// method chaining process
	
 ex.createTest("Test3").skip("this test is skipped");
	
	
	
	ex.flush();
	// below command will open the file in browser directly, what ever is your default browser. 
	Desktop.getDesktop().browse(new File("report1.html").toURI());
	
	}

}
