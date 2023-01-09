package com.actitime.test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportLogLevels
{
	@Test
	public void basicextentreport() throws IOException
	{		
		ExtentReports extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\ereport.html");
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		extent.attachReporter(sparkReporter);
		
	 	ExtentTest etest1=extent.createTest("Test One");
	 	ExtentTest etest2=extent.createTest("Test Two");
	 	ExtentTest etest3=extent.createTest("Test Three");
	 	ExtentTest etest4=extent.createTest("Test Four");
	 	ExtentTest etest5=extent.createTest("Test Five");
	 	
	 	etest1.log(Status.PASS, "Test One is pass");
	 	etest2.log(Status.FAIL, "Test Two is fail");
	 	etest3.log(Status.SKIP, "Test Three is skip");
	 	etest4.log(Status.INFO, "execution going on");
	 	etest5.log(Status.WARNING, "allignment problem");
		
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());
	}
}