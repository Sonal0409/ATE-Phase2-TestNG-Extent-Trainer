package com.phase2.ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
	
	public static WebDriver driver;
	public static ExtentReports extentreports;
	public static ExtentTest extentTest;
	
	@BeforeTest()
	public void openBrowser(ITestContext context)

	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		extentTest = extentreports.createTest(context.getName());
		String author = context.getCurrentXmlTest().getParameter("author");
		extentTest.assignAuthor(author);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

	@BeforeSuite
	public void InitializeExtentreport()
	{
		ExtentSparkReporter sparkreporter_all = new ExtentSparkReporter("alltests.html");
		extentreports= new ExtentReports();
		extentreports.attachReporter(sparkreporter_all);
		extentreports.setSystemInfo("OS", System.getProperty("os.name"));
		extentreports.setSystemInfo("JAVA", System.getProperty("java.version"));
	}
	
	@AfterSuite
	public void generateExtenetReport() throws IOException
	{
		extentreports.flush();
		Desktop.getDesktop().browse(new File("alltests.html").toURI());
	}
	
	@AfterMethod
	public void generatestatus(Method m, ITestResult result)
	{
		if(result.getStatus()== ITestResult.FAILURE)
		{
		System.out.println("capture Screenshot");
		extentTest.fail(result.getThrowable());
		
		}else if (result.getStatus()== ITestResult.SUCCESS) {
			extentTest.pass(m.getName() + "is passed");
		}
		
		
	}
	
	
}
