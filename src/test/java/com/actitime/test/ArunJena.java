package com.actitime.test;

import org.testng.annotations.Test;
import com.actitime.generics.BaseTest;
import com.aventstack.extentreports.ExtentTest;

public class ArunJena extends BaseTest
{
	@Test
	public void arun()
	{
		ExtentTest test=extent.createTest("Arun Jena");
		System.out.println("arun");
	}
}