package com.actitime.test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogTextBoldItalicUnderline
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
	 	
	 	etest1.log(Status.PASS, "<b>Test One is pass</b>");
	 	etest2.log(Status.FAIL, "<i>Test Two is fail</i>");
	 	etest3.log(Status.SKIP, "<u>Test Three is skip</u>");
	 	
	 	extent.flush();
		Desktop.getDesktop().browse(file.toURI());
	}
}