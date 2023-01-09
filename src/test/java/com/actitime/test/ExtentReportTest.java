package com.actitime.test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTest
{
	@Test
	public void basicextentreport() throws IOException
	{
		ExtentReports extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\ereport.html");
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		extent.attachReporter(sparkReporter);
		
	 	ExtentTest etest1=extent.createTest("Test One");
	 	//etest1.pass("Test one is passed");
	 	etest1.log(Status.PASS, "Test One is pass");
		
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());
	}
}