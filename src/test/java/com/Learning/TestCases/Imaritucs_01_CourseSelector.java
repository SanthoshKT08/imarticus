package com.Learning.TestCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.Learning.Generics.Baseclass;
import com.Learning.Generics.FileUtilities;
import com.Learning.PageObjectRepository.CourseSelector;
import com.Learning.PageObjectRepository.HomePage;
import com.Learning.PageObjectRepository.Recommendation;
import com.Learning.PageObjectRepository.ThankYouPage;
import com.aventstack.extentreports.Status;

public class Imaritucs_01_CourseSelector extends Baseclass {

	@Test(priority = 1)
	public void TC_01_logoFunctionality()
	{
		test=reports.createTest("TC_01 : Logo", "Redirect to home page.");

		HomePage Function = new HomePage(driver);

		Function.logo();

		test.log(Status.INFO, "On Success, Logo is working..");
	}

  
	@Test(priority = 2)
	public void TC_02_CourseSelector() throws InterruptedException
	{
		Thread.sleep(2000);

		test=reports.createTest("TC_02 : Course Selector", "Redirect to course Selector page.");

		HomePage hP = new HomePage(driver);

		hP.clickOnCourseSelctor();
		
		Assert.fail();

		test.log(Status.INFO, "On Success, System should redirected to course selector page..");
	}

    @Ignore
	@Test(priority = 3)
	public void TC_03_CourseSelector() throws InterruptedException
	{

		test=reports.createTest("TC_03 : Course Selector", "Checking reponse to recommendation page..");

		CourseSelector cs = new CourseSelector(driver);

		Thread.sleep(1000);

		test.log(Status.INFO, "On Success, System should redirected to 1st step..");

		cs.clickOnFirstStep();

		test.log(Status.INFO, "On Success, System should redirected to 2nd step..");

		Thread.sleep(1000);

		cs.clickOnSecondStep();

		test.log(Status.INFO, "On Success, System should redirected to 3nd step..");

		Thread.sleep(1000);

		cs.clickOnThirdStep();

		test.log(Status.INFO, "On Success, System should redirected to 4nd step..");

		Thread.sleep(1000);

		cs.clickOnFourthStep();

		test.log(Status.INFO, "On Success, System should redirected to 5nd step..");

		Thread.sleep(1000);

		cs.clickOnFifthStep();

		test.log(Status.INFO, "On Success, System should redirected to 6nd step..");

		Thread.sleep(1000);

		cs.clickOnSixthStep();

		test.log(Status.INFO, "On Success, System should redirected to 7nd step..");

		Thread.sleep(1000);

		cs.clickOnSeventhStep();

		test.log(Status.INFO, "On Success, System should redirected to 8nd step..");

		Thread.sleep(1000);

		cs.enterFirstNameInField("Automation");

		test.log(Status.INFO, "On Success, FirstName entered successfully");

		cs.enterLastNameInField("Testing");

		test.log(Status.INFO, "On Success, LastName entered successfully");

		cs.enterEmailInField("testing18@gmail.com");

		test.log(Status.INFO, "On Success, email entered successfully");

		cs.enterContactNumberInField("8335237079");

		test.log(Status.INFO, "On Success, contact number entered successfully");

		cs.clickOnSeeRecommendationbtn();

		test.log(Status.INFO, "On Success, System should redirected to recommendation page");

	}
    @Ignore
	@Test(priority = 4)
	public void TC_04_Recommendation() throws InterruptedException
	{
		Thread.sleep(2000);

		test=reports.createTest("TC_04 : Recommendation", "Checking reponse for Recommendation page..");

		FileUtilities.getWindowsHandles(driver, 0);

		test.log(Status.INFO, "On Success, System should exapand tabs - go to parent tab");

		ThankYouPage tk = new ThankYouPage(driver);

		//FileUtilities.scrollPage(driver, "window.scrollBy(0,400)", "");

		tk.clickOnSubmitYourEnquiry(driver);

		test.log(Status.INFO, "On Success, System should display the popup - paynow and done");

		tk.clickOnDone();

		test.log(Status.INFO, "On Success, System should redirected to course selector page");

		driver.close();

		Thread.sleep(2000);

		FileUtilities.getWindowsHandles(driver, 0);

		test.log(Status.INFO, "On Success, System should redirected to recommendation page");

		FileUtilities.scrollPage(driver, "window.scrollBy(0,1100)", "");

		Recommendation Rc = new Recommendation(driver);

		Thread.sleep(1000);

		Rc.clickOnLearnMore();

		test.log(Status.INFO, "On Success, System should redirected to program page");

	}

}
