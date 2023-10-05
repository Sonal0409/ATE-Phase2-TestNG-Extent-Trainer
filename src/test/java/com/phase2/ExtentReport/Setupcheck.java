package com.phase2.ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Setupcheck {
	
	
	// Create empty report to check the set up
	// Report file is created in the location given as absolute path

	@Test
	public void extentDemo() {

	ExtentReports ex = new ExtentReports();  // this extent report engine
	
	// this is reporter in extent reports
	ExtentSparkReporter sparkreporter = new ExtentSparkReporter("C:\\Users\\sonal\\Eclipse-2023\\Phase2-TestNG-Extent-Junit\\extentReports\\report.html");
	
	
	// attach reproter to extent engine
	
	ex.attachReporter(sparkreporter);
	ex.flush();
	
	}
	
	// OR
	
	// use the method 2 to generate report by creating file instance and passing file name
	// Use this in class 
	
	@Test
	public void extentDemo2() throws IOException {

	ExtentReports ex = new ExtentReports();  // this extent report engine
	
	File file = new File("report1.html");
	ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
	ex.attachReporter(sparkreporter);
	ex.flush();
	// below command will open the file in browser directly, what ever is your default browser. 
	Desktop.getDesktop().browse(new File("report1.html").toURI());
	
	}
}
