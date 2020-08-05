package com.Learning.PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Learning.Generics.FileUtilities;

public class Certifiedinvestmentbankingoperationsprogram {


	public Certifiedinvestmentbankingoperationsprogram(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'APPLY')]")
	private WebElement CIBOPApplaybtn;

	@FindBy(xpath = "//input[@placeholder='First name*']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@placeholder='Last name*']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@placeholder='Email ID*']")
	private WebElement emailID;

	@FindBy(xpath = "//input[@placeholder='Contact number*']")
	private WebElement contactNumber;

	@FindBy(xpath = "//select[@name='Location']")
	private WebElement CIBOPLocation;

	@FindBy(xpath = "//button[@class='btn pt-2 pb-2 PopupSubmitBtn']")
	private WebElement nextBtn;

	@FindBy(xpath = "//span[contains(text(),'Download Brochure')]")
	private WebElement downloadBrochurebtn;

	@FindBy(xpath = "//button[contains(@class,'btn-lg updatePartnerButton')]")
	private WebElement viewBatch;

	@FindBy(xpath = "//img[contains(@class,'popupCloseLogoBatches')]")
	private WebElement closeViewBatch;

	@FindBy(xpath = "//button[contains(text(),'DOWNLOAD PLACEMENT REPORT')]")
	public WebElement downloadPlacementReport;

	@FindBy(xpath = "//button[contains(text(),'SOUNDS INTERESTING? REGISTER FOR THIS COURSE NOW!')]")
	public WebElement soundsIntersting;

	@FindBy(xpath = "//button[@class='jobBtn float-sm-right']")
	public WebElement viewDetailedCurriculam;

	@FindBy(xpath = "//button[@class='btn btn-outline-dark btn-lg carriculamBtn text-secondary float-sm-left']")
	public WebElement downloadBrochurebtn2;

	@FindBy(xpath = "//button[contains(text(),'SEE YOURSELF AS ONE OF THESE PROFESSIONALS? SIGN U')]")
	public WebElement seeYourselfProfessional;

	@FindBy(xpath = "//button[@class='btn btn-outline-primary btn-lg carriculamBtn text-primary float-sm-center']")
	public WebElement enroll_1;

	@FindBy(xpath = "//span[@class='middleAlign pr-4']")
	public WebElement enroll_2;

	@FindBy(xpath = "//span[contains(text(),'Start your success story')]")
	public WebElement startYourSuccessStory;

	@FindBy(xpath = "//button[contains(text(),'2')]")
	public WebElement studentsaid1;

	@FindBy(xpath = "//button[contains(text(),'3')]")
	public WebElement studentsaid2;

	@FindBy(xpath = "//h3[contains(text(),'Why Do So Many People Want to Go into In...')]")
	public WebElement resource1;

	@FindBy(xpath = "//h3[contains(text(),'Investment Banking and Its Key Advantage...')]")
	public WebElement resource2;

	@FindBy(xpath = "//h3[contains(text(),'How Investment Bankers Can Find Success ...')]")
	public WebElement resource3;

	@FindBy(xpath = "//button[contains(@class,'ImarticusFrKnowledge')]")
	public WebElement centreOfExcellence;

	@FindBy(xpath = "//span[contains(@class,'pr-1')]")
	public WebElement exploreCourses;

	@FindBy(xpath = "//button[contains(@class,'ImarticusExpertBtn')]")
	public WebElement speakToAnExpert;

	public void clickOnCIBOPApplybtn(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, CIBOPApplaybtn);
	}

	public void enterFirstName(String fName)
	{
		firstName.sendKeys(fName);
	}

	public void enterLastName(String lName)
	{
		lastName.sendKeys(lName);
	}

	public void enterEmailID(String eID)
	{
		emailID.sendKeys(eID);
	}

	public void enterContactNumber(String cNumber)
	{
		contactNumber.sendKeys(cNumber);
	}

	public void selectLocation(String location)
	{
		FileUtilities.dropDownField(CIBOPLocation, location);
	}

	public void clickOnNext()
	{
		nextBtn.click();
	}

	public void clickOnDownloadBrochure(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, downloadBrochurebtn);
	}

	public void clickOnViewBatch(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, viewBatch);
	}

	public void clickOnCloseViewBatch()
	{
		closeViewBatch.click();
	}

	public void clickOnDownloadPlacementReport(WebDriver driver)
	{		
		FileUtilities.handleElementClickInterceptedException(driver, downloadPlacementReport);
	}

	public void clickonSoundsIntersting(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, soundsIntersting);
	}

	public void clickOnviewDeatailedCurriculam(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, viewDetailedCurriculam);
	}

	public void clickOnDownloadBrochure2(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, downloadBrochurebtn2);
	}

	public void clickOnSeeYOurselfProfessional(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, seeYourselfProfessional);
	}

	public void clickOnEnroll_1(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, enroll_1);
	}

	public void clickOnEnroll_2(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, enroll_2);
	}

	public void clickOnStudentSaid(WebDriver driver) throws InterruptedException
	{

		FileUtilities.handleElementClickInterceptedException(driver, studentsaid1);

		Thread.sleep(2000);

		FileUtilities.handleElementClickInterceptedException(driver, studentsaid2);
	}

	public void clickOnStartYourSuccessStoty(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, startYourSuccessStory);
	}

	public void clickOnResource1(WebDriver driver)
	{
		FileUtilities.scrollUntilElementFind(driver, resource1);
		FileUtilities.handleElementClickInterceptedException(driver, resource1);
	}

	public void clickOnResource2(WebDriver driver)
	{
		FileUtilities.scrollUntilElementFind(driver, resource2);
		FileUtilities.handleElementClickInterceptedException(driver, resource2);
	}

	public void clickOnResource3(WebDriver driver)
	{
		FileUtilities.scrollUntilElementFind(driver, resource3);
		FileUtilities.handleElementClickInterceptedException(driver, resource3);
	}

	public void clickOnCentreOfExcellence(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, centreOfExcellence);
	}

	public void clickOnExploreCourses(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, exploreCourses);
	}

	public void clickOnSpeakToAnExpert(WebDriver driver)
	{
		FileUtilities.handleElementClickInterceptedException(driver, speakToAnExpert);
	}

}
