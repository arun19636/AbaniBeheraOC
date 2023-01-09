package com.actitime.generics;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshot implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;		
		File srcfile=ts.getScreenshotAs(OutputType.FILE);		
		String method=result.getName();
		Date date=Calendar.getInstance().getTime();
		String today=date.toString().replaceAll(":", "_");		
		File destfile=new File("./failedscreenshot/"+method + today+".png");
		try
		{
			FileUtils.copyFile(srcfile, destfile);			
		} 
		catch (IOException e)
		{	
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;		
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		
		String method=result.getName();
		Date date=Calendar.getInstance().getTime();
		String today=date.toString().replaceAll(":", "_");		
		File destfile=new File("./skippedscreenshot/"+method + today+".png");
		try
		{
			FileUtils.copyFile(srcfile, destfile);
			
		} 
		catch (IOException e)
		{	
			
		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
