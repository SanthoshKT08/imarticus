package com.Learning.TestCases;

import org.testng.annotations.Test;

import com.Learning.Generics.Baseclass;
import com.Learning.PageObjectRepository.Career;
import com.aventstack.extentreports.Status;

public class Imarticus_03_CareerServices extends Baseclass {
	
	@Test(priority = 22)
	public void TC_22_CareerService() throws InterruptedException
	{
		
		test=reports.createTest("TC_22 : Career ", "Checking Career service page");
		
		Career c = new Career(driver);
		
		c.moveToCareer(driver);
		
		test.log(Status.INFO, "On Success, System should expand the Career popup..");

		Thread.sleep(1000);

		c.ClickOnCareerServices();

		test.log(Status.INFO, "On Success, System should navigate to career services page..");
		
		c.VerifyTextMessage(driver);
		
		c.VerifyTitlePage(driver);
	}

}
