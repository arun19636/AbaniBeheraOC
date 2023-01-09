package com.actitime.test;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

@Listeners(com.actitime.generics.Screenshot.class)
public class ActitimeLoginLogout extends BaseTest
{		
	@Test
	public void loginlogout() throws InterruptedException, IOException
	{		
		ExtentTest test=extent.createTest("Actitime Login & Logout");
		
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
}