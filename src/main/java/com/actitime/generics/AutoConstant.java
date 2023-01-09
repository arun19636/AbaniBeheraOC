package com.actitime.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface AutoConstant 
{	
	String silent_output="webdriver.chrome.silentOutput";
	
	String chromelog_key="webdriver.chrome.logfile";
	String logfile_path="./chromelog/logfile.txt";
	
	String url="https://demo.actitime.com";
	
	String excel_path="./testdata/ActiTIMEData.xlsx";
	
	String sheet_name="logindata";		
}