package com.Learning.TestCases;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.Learning.Generics.Baseclass;
import com.Learning.Generics.FileUtilities;
import com.Learning.PageObjectRepository.CalendyPage;
import com.Learning.PageObjectRepository.Certifiedinvestmentbankingoperationsprogram;
import com.Learning.PageObjectRepository.Programs;
import com.Learning.PageObjectRepository.ThankYouPage;
import com.aventstack.extentreports.Status;

public class Imarticus_02_CIBOP_Program extends Baseclass {


	@Test(priority = 5)
	public void TC_05_InvestmentBankingOperation() throws InterruptedException
	{
		Thread.sleep(4000);

		test=reports.createTest("TC_05 : Programs", "Checking Investmet Banking Operation");

		Programs pr = new Programs(driver);

		FileUtilities.actionClass(driver, pr.programs);

		test.log(Status.INFO, "On Success, System should expand the program popup..");

		Thread.sleep(1000);

		pr.clickOnInvestmentBankingOperation();

		test.log(Status.INFO, "On Success, System should navigate to Investment Banking Operation page..");

		Thread.sleep(2000);
	}


	@Test(priority = 6)
	public void TC_06_enterTheCIBOPForm() throws InterruptedException
	{

		Thread.sleep(4000);

		test=reports.createTest("TC_06 : CIBOP form", "Filling form");

//		String actual=driver.getTitle();
//
//		Assert.assertEquals(actual, "Investment Banking Courses, Training & Certification - Imarticus Learning");
		
		FileUtilities.verifyTitlePage(driver, "Investment Banking Courses, Training & Certification - Imarticus Learning");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		CIBOP.clickOnCIBOPApplybtn(driver);

		test.log(Status.INFO, "On Success, System should display the popup");

		CIBOP.enterFirstName("");

		test.log(Status.INFO, "On Success, First name entered successfully.");

		CIBOP.enterLastName("");

		test.log(Status.INFO, "On Success, Last name entered successfully.");

		CIBOP.enterEmailID("");

		test.log(Status.INFO, "On Success, Email address entered successfully.");

		CIBOP.enterContactNumber("");

		test.log(Status.INFO, "On Success, Contact number entered successfully.");

		CIBOP.selectLocation(" Hyderabad");

		test.log(Status.INFO, "On Success, location selected successfully.");

		CIBOP.clickOnNext();

		test.log(Status.INFO, "On Success, System should redirected to thank you page.");	

		Thread.sleep(2000);

		ThankYouPage tk = new ThankYouPage(driver);

		Thread.sleep(1000);

		tk.clickOnSubmitYourEnquiry(driver);

		test.log(Status.INFO, "On Success, System should redirected to  pre-assessment page.");	

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		FileUtilities.getWindowsHandles(driver, 0);

		tk.clickOnDone();

	}


	@Test(priority = 7)
	public void TC_07_DownlaodBrochure() throws InterruptedException
	{
		test=reports.createTest("TC_07 :Download Brochure", "Filling form");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		CIBOP.clickOnDownloadBrochure(driver);

		test.log(Status.INFO, "On Success, System should display the popup");

		CIBOP.enterFirstName("");

		test.log(Status.INFO, "On Success, First name entered successfully.");

		CIBOP.enterLastName("");

		test.log(Status.INFO, "On Success, Last name entered successfully.");

		CIBOP.enterEmailID("");

		test.log(Status.INFO, "On Success, Email address entered successfully.");

		CIBOP.enterContactNumber("");

		test.log(Status.INFO, "On Success, Contact number entered successfully.");

		CIBOP.selectLocation(" Navi Mumbai Thane");

		test.log(Status.INFO, "On Success, location selected successfully.");

		CIBOP.clickOnNext();

		test.log(Status.INFO, "On Success, System should redirected to thank you page.");	

		Thread.sleep(1000);

		ThankYouPage tk = new ThankYouPage(driver);

		Thread.sleep(1000);

		tk.clickOnSubmitYourEnquiry(driver);

		test.log(Status.INFO, "On Success, System should redirected to  PDF page.");

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		FileUtilities.getWindowsHandles(driver, 0);

		tk.clickOnDone();

	}


	@Test(priority = 8)
	public void TC_08_ViewBatch() throws InterruptedException
	{
		Thread.sleep(1000);

		test=reports.createTest("TC_08 :View Batch", "CIBOP");

		FileUtilities.scrollPage(driver, "window.scrollBy(0,400)", "");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		CIBOP.clickOnViewBatch(driver);

		test.log(Status.INFO, "On Success, System should display the view batch popup.");

		Thread.sleep(1000);

		CIBOP.clickOnCloseViewBatch();
	}

	@Test(priority = 9)
	public void TC_09_DownlaodPlacementReport() throws InterruptedException
	{
		test=reports.createTest("TC_09 : Downlaod Placement Report", "Filling form");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.downloadPlacementReport);

		CIBOP.clickOnDownloadPlacementReport(driver);

		test.log(Status.INFO, "On Success, System should display the popup");

		CIBOP.enterFirstName("");

		test.log(Status.INFO, "On Success, First name entered successfully.");

		CIBOP.enterLastName("");

		test.log(Status.INFO, "On Success, Last name entered successfully.");

		CIBOP.enterEmailID("");

		test.log(Status.INFO, "On Success, Email address entered successfully.");

		CIBOP.enterContactNumber("");

		test.log(Status.INFO, "On Success, Contact number entered successfully.");

		CIBOP.selectLocation(" Bangalore Koramangala");

		test.log(Status.INFO, "On Success, location selected successfully.");

		CIBOP.clickOnNext();

		test.log(Status.INFO, "On Success, System should redirected to thank you page.");	

		Thread.sleep(2000);

		ThankYouPage tk = new ThankYouPage(driver);

		Thread.sleep(1000);

		tk.clickOnSubmitYourEnquiry(driver);

		test.log(Status.INFO, "On Success, System should redirected to  pre-assessment page.");	

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		FileUtilities.getWindowsHandles(driver, 0);

		tk.clickOnDone();

	}

	@Test(priority = 10)
	public void TC_10_DownloadPlacementReport() throws InterruptedException
	{
		test=reports.createTest("TC_10 : Downlaod Placement Report", "Filling form");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.soundsIntersting);

		CIBOP.clickonSoundsIntersting(driver);

		test.log(Status.INFO, "On Success, System should display the popup");

		CIBOP.enterFirstName("");

		test.log(Status.INFO, "On Success, First name entered successfully.");

		CIBOP.enterLastName("");

		test.log(Status.INFO, "On Success, Last name entered successfully.");

		CIBOP.enterEmailID("");

		test.log(Status.INFO, "On Success, Email address entered successfully.");

		CIBOP.enterContactNumber("");

		test.log(Status.INFO, "On Success, Contact number entered successfully.");

		CIBOP.selectLocation(" Bangalore Koramangala");

		test.log(Status.INFO, "On Success, location selected successfully.");

		CIBOP.clickOnNext();

		test.log(Status.INFO, "On Success, System should redirected to thank you page.");	

		Thread.sleep(2000);

		ThankYouPage tk = new ThankYouPage(driver);

		Thread.sleep(2000);

		tk.clickOnSubmitYourEnquiry(driver);

		test.log(Status.INFO, "On Success, System should redirected to  pre-assessment page.");	

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		FileUtilities.getWindowsHandles(driver, 0);

		tk.clickOnDone();
	}

	@Test(priority = 11)
	public void TC_11_ViewDeatailedCurriculam() throws InterruptedException
	{
		test=reports.createTest("TC_11: View Detailed curriculam page", "Filling form");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.viewDetailedCurriculam);

		CIBOP.clickOnviewDeatailedCurriculam(driver);

		test.log(Status.INFO, "On Success, System should redirected to curriculam page.");

		Thread.sleep(2000);

		Imarticus_02_CIBOP_Program Imarticus02 = new Imarticus_02_CIBOP_Program();

		Imarticus02.TC_05_InvestmentBankingOperation();

		test.log(Status.INFO, "On Success, System should redirected to  CIBOP page.");	
	}


	@Test(priority = 12)
	public void TC_12_DownlaodBrochure2() throws InterruptedException
	{
		test=reports.createTest("TC_12 :Download Brochure - 2 ", "Filling form");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.downloadBrochurebtn2);

		CIBOP.clickOnDownloadBrochure2(driver);

		test.log(Status.INFO, "On Success, System should display the popup");

		CIBOP.enterFirstName("");

		test.log(Status.INFO, "On Success, First name entered successfully.");

		CIBOP.enterLastName("");

		test.log(Status.INFO, "On Success, Last name entered successfully.");

		CIBOP.enterEmailID("");

		test.log(Status.INFO, "On Success, Email address entered successfully.");

		CIBOP.enterContactNumber("");

		test.log(Status.INFO, "On Success, Contact number entered successfully.");

		CIBOP.selectLocation(" Jaipur");

		test.log(Status.INFO, "On Success, location selected successfully.");

		CIBOP.clickOnNext();

		test.log(Status.INFO, "On Success, System should redirected to thank you page.");	

		Thread.sleep(2000);

		ThankYouPage tk = new ThankYouPage(driver);

		Thread.sleep(2000);

		tk.clickOnSubmitYourEnquiry(driver);

		test.log(Status.INFO, "On Success, System should redirected to  pre-assessment page.");	

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		FileUtilities.getWindowsHandles(driver, 0);

		tk.clickOnDone();

	}


	@Test(priority = 13)
	public void TC_13_SEEYOURSELFASONEOFTHESEPROFESSIONALSSIGNUP() throws InterruptedException
	{
		test=reports.createTest("TC_13 : SEE YOUR SELF AS ONE OF THESE PROFESSIONALSSIGNUP ", "Filling form");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.seeYourselfProfessional);

		CIBOP.clickOnSeeYOurselfProfessional(driver);

		test.log(Status.INFO, "On Success, System should display the popup");

		CIBOP.enterFirstName("");

		test.log(Status.INFO, "On Success, First name entered successfully.");

		CIBOP.enterLastName("");

		test.log(Status.INFO, "On Success, Last name entered successfully.");

		CIBOP.enterEmailID("");

		test.log(Status.INFO, "On Success, Email address entered successfully.");

		CIBOP.enterContactNumber("");

		test.log(Status.INFO, "On Success, Contact number entered successfully.");

		CIBOP.selectLocation(" Jaipur");

		test.log(Status.INFO, "On Success, location selected successfully.");

		CIBOP.clickOnNext();

		test.log(Status.INFO, "On Success, System should redirected to thank you page.");	

		Thread.sleep(2000);

		ThankYouPage tk = new ThankYouPage(driver);

		Thread.sleep(2000);

		tk.clickOnSubmitYourEnquiry(driver);

		test.log(Status.INFO, "On Success, System should redirected to  pre-assessment page.");	

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		FileUtilities.getWindowsHandles(driver, 0);

		tk.clickOnDone();

	}


	@Test(priority = 14)
	public void TC_14_Enroll_1() throws InterruptedException
	{
		test=reports.createTest("TC_14 : Enroll - 1 ", "Filling form");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.enroll_1);

		CIBOP.clickOnEnroll_1(driver);

		test.log(Status.INFO, "On Success, System should display the popup");

		CIBOP.enterFirstName("");

		test.log(Status.INFO, "On Success, First name entered successfully.");

		CIBOP.enterLastName("");

		test.log(Status.INFO, "On Success, Last name entered successfully.");

		CIBOP.enterEmailID("");

		test.log(Status.INFO, "On Success, Email address entered successfully.");

		CIBOP.enterContactNumber("");

		test.log(Status.INFO, "On Success, Contact number entered successfully.");

		CIBOP.selectLocation(" Jaipur");

		test.log(Status.INFO, "On Success, location selected successfully.");

		CIBOP.clickOnNext();

		test.log(Status.INFO, "On Success, System should redirected to thank you page.");	

		Thread.sleep(2000);

		ThankYouPage tk = new ThankYouPage(driver);

		Thread.sleep(2000);

		tk.clickOnSubmitYourEnquiry(driver);

		test.log(Status.INFO, "On Success, System should redirected to  pre-assessment page.");	

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		FileUtilities.getWindowsHandles(driver, 0);

		tk.clickOnDone();
	}


	@Test(priority = 15)
	public void TC_15_Enroll_2() throws InterruptedException
	{
		test=reports.createTest("TC_15 : Enroll - 2 ", "Filling form");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.enroll_2);

		CIBOP.clickOnEnroll_2(driver);

		test.log(Status.INFO, "On Success, System should display the popup");

		CIBOP.enterFirstName("");

		test.log(Status.INFO, "On Success, First name entered successfully.");

		CIBOP.enterLastName("");

		test.log(Status.INFO, "On Success, Last name entered successfully.");

		CIBOP.enterEmailID("");

		test.log(Status.INFO, "On Success, Email address entered successfully.");

		CIBOP.enterContactNumber("");

		test.log(Status.INFO, "On Success, Contact number entered successfully.");

		CIBOP.selectLocation(" Chennai - Nungambakkam");

		test.log(Status.INFO, "On Success, location selected successfully.");

		CIBOP.clickOnNext();

		test.log(Status.INFO, "On Success, System should redirected to thank you page.");	

		Thread.sleep(2000);

		ThankYouPage tk = new ThankYouPage(driver);

		Thread.sleep(2000);

		tk.clickOnSubmitYourEnquiry(driver);

		test.log(Status.INFO, "On Success, System should redirected to  pre-assessment page.");	

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		FileUtilities.getWindowsHandles(driver, 0);

		tk.clickOnDone();
	}

	@Test(priority = 16)
	public void TC_16_StudentSaid() throws InterruptedException
	{
		test=reports.createTest("TC_16 : Student said Review ", "Checking Sliding");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.startYourSuccessStory);

		CIBOP.clickOnStudentSaid(driver);

		test.log(Status.INFO, "On Success, System should slides 2 students reviews");	
	}


	@Test(priority = 17)
	public void TC_17_StarYourSuccessStory() throws InterruptedException
	{
		test=reports.createTest("TC_17 : Start your success story ", "Filling form");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.startYourSuccessStory);

		CIBOP.clickOnStartYourSuccessStoty(driver);

		test.log(Status.INFO, "On Success, System should display the popup");

		CIBOP.enterFirstName("");

		test.log(Status.INFO, "On Success, First name entered successfully.");

		CIBOP.enterLastName("");

		test.log(Status.INFO, "On Success, Last name entered successfully.");

		CIBOP.enterEmailID("");

		test.log(Status.INFO, "On Success, Email address entered successfully.");

		CIBOP.enterContactNumber("");

		test.log(Status.INFO, "On Success, Contact number entered successfully.");

		CIBOP.selectLocation(" Chennai - Nungambakkam");

		test.log(Status.INFO, "On Success, location selected successfully.");

		CIBOP.clickOnNext();

		test.log(Status.INFO, "On Success, System should redirected to thank you page.");	

		Thread.sleep(2000);

		ThankYouPage tk = new ThankYouPage(driver);

		Thread.sleep(2000);

		tk.clickOnSubmitYourEnquiry(driver);

		test.log(Status.INFO, "On Success, System should redirected to  pre-assessment page.");	

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		FileUtilities.getWindowsHandles(driver, 0);

		tk.clickOnDone();
	}

	@Ignore
	@Test(priority = 18)
	public void TC_18_Resources() throws InterruptedException
	{
		Thread.sleep(2000);

		test=reports.createTest("TC_18 : Resources ", "Checking Links");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollPage(driver, "window.scrollBy(0,1000)", "");

		FileUtilities.scrollPage(driver, "window.scrollBy(0,1000)", "");

		//	FileUtilities.scrollUntilElementFind(driver, CIBOP.resource1);

		CIBOP.clickOnResource1(driver);

		test.log(Status.INFO, "On Success, System should redirected to Why Do So Many People Want to Go into In page");	

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		Thread.sleep(10000);

		FileUtilities.getWindowsHandles(driver, 0);

		Thread.sleep(1000);

		FileUtilities.scrollPage(driver, "window.scrollBy(0,1000)", "");

		FileUtilities.scrollPage(driver, "window.scrollBy(0,1000)", "");

		//FileUtilities.scrollUntilElementFind(driver, CIBOP.resource2);

		CIBOP.clickOnResource2(driver);

		test.log(Status.INFO, "On Success, System should redirected to Investment Banking and Its Key Advantage page");	

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		Thread.sleep(10000);

		FileUtilities.getWindowsHandles(driver, 0);

		Thread.sleep(1000);

		FileUtilities.scrollPage(driver, "window.scrollBy(0,1000)", "");

		FileUtilities.scrollPage(driver, "window.scrollBy(0,1000)", "");

		//FileUtilities.scrollUntilElementFind(driver, CIBOP.resource3);

		CIBOP.clickOnResource3(driver);

		test.log(Status.INFO, "On Success, System should redirected to How Investment Bankers Can Find Success ... page");	

		FileUtilities.getWindowsHandles(driver, 1);

		driver.close();

		Thread.sleep(10000);

		FileUtilities.getWindowsHandles(driver, 0);

	}

	@Test(priority = 19)
	public void TC_19_CentreOfExcellence() throws InterruptedException
	{
		test=reports.createTest("TC_19: Centre of Excellence ", "Checking Link ");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.centreOfExcellence);

		CIBOP.clickOnCentreOfExcellence(driver);

		test.log(Status.INFO, "On Success, System should redirected to Centre of excellence page.");

		Thread.sleep(2000);

		Imarticus_02_CIBOP_Program Imarticus02 = new Imarticus_02_CIBOP_Program();

		Imarticus02.TC_05_InvestmentBankingOperation();

		test.log(Status.INFO, "On Success, System should redirected to  CIBOP page.");	
	}


	@Test(priority = 20)
	public void TC_20_ExploreCourse() throws InterruptedException
	{
		test=reports.createTest("TC_20 : ExploreCourse ", "Checking Link ");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.exploreCourses);

		CIBOP.clickOnExploreCourses(driver);

		test.log(Status.INFO, "On Success, System should redirected to Course selector page.");

		Thread.sleep(2000);

		Imarticus_02_CIBOP_Program Imarticus02 = new Imarticus_02_CIBOP_Program();

		Imarticus02.TC_05_InvestmentBankingOperation();

		test.log(Status.INFO, "On Success, System should redirected to  CIBOP page.");	
	}

	@Test(priority = 21)
	public void TC_21_SpeakToAnExpert() throws InterruptedException
	{
		test=reports.createTest("TC_21 : Speak to an expert ", "Checking Link ");

		Certifiedinvestmentbankingoperationsprogram CIBOP = new Certifiedinvestmentbankingoperationsprogram(driver);

		FileUtilities.scrollUntilElementFind(driver, CIBOP.speakToAnExpert);

		CIBOP.clickOnSpeakToAnExpert(driver);

		test.log(Status.INFO, "On Success, System should redirected to Calendy  page.");

		Thread.sleep(2000);

		FileUtilities.getWindowsHandles(driver, 0);

		Thread.sleep(1000);

		FileUtilities.getWindowsHandles(driver, 1);

		CalendyPage cp = new CalendyPage(driver);

		cp.clickOnDate();

		test.log(Status.INFO, "On Success, User selected Date");

		cp.clickOnTime();

		test.log(Status.INFO, "On Success, User selected time");

		cp.clickOnConfirm();

		test.log(Status.INFO, "On Success, System redirected to Enter details page");

		cp.enterFullFirst("santhosh");

		test.log(Status.INFO, "On Success, User entered the full name");

		cp.enterEmail("sa@gmail.com");

		test.log(Status.INFO, "On Success, User entered the email address");

		cp.enterContactNumber("7531597894");

		test.log(Status.INFO, "On Success, User entered the contact number");

		cp.clickOnSelectLocation();

		test.log(Status.INFO, "On Success, User selected the location");

		cp.clickOnModeOfLearning();

		test.log(Status.INFO, "On Success, User selected the mode of learning");

		cp.enterMessage("hello");

		test.log(Status.INFO, "On Success, User entered the message text");

		cp.clickOnScheduleEvent();

		test.log(Status.INFO, "On Success, System should redirected to thank you page");

		Thread.sleep(2000);

		ThankYouPage tk = new ThankYouPage(driver);

		//FileUtilities.scrollPage(driver, "window.scrollBy(0,600)", "");

		Thread.sleep(1000);

		tk.clickOnSubmitYourEnquiry(driver);

		test.log(Status.INFO, "On Success, System should redirected to  pre-assessment page.");	

		FileUtilities.getWindowsHandles(driver, 2);

		driver.close();

		FileUtilities.getWindowsHandles(driver, 1);

		tk.clickOnDone();

		driver.close();

		FileUtilities.getWindowsHandles(driver, 0);
	}

}
