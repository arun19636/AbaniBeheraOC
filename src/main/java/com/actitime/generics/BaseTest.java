package com.actitime.generics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
	
	public static ExtentReports extent;
		
	@BeforeClass
	public void setup() throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);	
	}
	
	@BeforeMethod
	public void report()
	{		
		File file=new File(System.getProperty("user.dir")+"\\ExtentReport\\ereport.html");
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(file);
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
	}
	
	@AfterMethod
	public void report1() 
	{
		extent.flush();		
	}	
	
	@AfterClass
	public void teardown() throws IOException
	{
		//driver.quit();
	}
}