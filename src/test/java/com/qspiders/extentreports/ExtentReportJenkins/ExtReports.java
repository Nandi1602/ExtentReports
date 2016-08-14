package com.qspiders.extentreports.ExtentReportJenkins;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtReports {
ExtentReports report = new ExtentReports("./ExtentReports/ExtentReport.html",true);
	
	@Test
	public void extnreports()
	{
		
		ExtentTest logger = report.startTest("extnreports1");
		logger.log(LogStatus.PASS, "test passed..");
		report.endTest(logger);
		//report.flush();
		
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		driver.close();
		Reporter.log("Test Executed from Jenkins", true);*/
	}
	
	@Test
	public void test1()
	{
		
		ExtentTest logger = report.startTest("test2");
		logger.log(LogStatus.FAIL, "test failed..");
		report.endTest(logger);
		report.flush();
		
		
	}

}
