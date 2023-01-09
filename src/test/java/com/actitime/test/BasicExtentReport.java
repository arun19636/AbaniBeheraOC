package com.actitime.test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BasicExtentReport
{
	@Test
	public void basicextentreport() throws IOException
	{
		ExtentReports extent=new ExtentReports();
		File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\ereport.html");
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		extent.attachReporter(sparkReporter);
		extent.flush();
		Desktop.getDesktop().browse(file.toURI());
	}
}