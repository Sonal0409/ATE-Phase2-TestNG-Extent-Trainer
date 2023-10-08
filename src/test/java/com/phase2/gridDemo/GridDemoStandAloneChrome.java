package com.phase2.gridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemoStandAloneChrome {

	
	 WebDriver driver;
		
	 @Test
		public void griddemoChrome() throws MalformedURLException {
			// TODO Auto-generated method stub
			
		   ChromeOptions cap = new ChromeOptions();
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			
			driver.get("https://www.selenium.dev/downloads/");
			
		}

	
}
