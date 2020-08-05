package com.Learning.PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseSelector {
	
	public CourseSelector(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='courseSubDivActive']//div[1]//div[1]")
	private WebElement firstStep;
	
	@FindBy(xpath = "//div[@class='steps-content']//div[2]")
	private WebElement secondStep;
	
	@FindBy(xpath = "//div[@class='courseSubDivActive']//div[1]//div[1]//img[1]")
	private WebElement thirdStep;
	
	@FindBy(xpath = "//div[@class='courseSubDivActive']//div[1]//div[1]//div[1]//img[1]")
	private WebElement fourthStep;
	
	@FindBy(xpath = "//div[@class='courseSubDivActive']//div[1]//div[1]//div[1]//img[1]")
	private WebElement fifthStep;
	
	@FindBy(xpath = "//div[@class='steps-content']//div[2]//div[1]//div[1]//div[3]//ul[1]//li[2]")
	private WebElement sixthStep;
	
	@FindBy(xpath = "//p[text()=\"Online Instructor led\"]")
	private WebElement seventhStep_OnlineInstructorLed;

	@FindBy(xpath = "//input[@placeholder='ENTER YOUR FIRST NAME']")
	private WebElement enterFirstName;
	
	@FindBy(xpath = "//input[@placeholder='ENTER YOUR LAST NAME']")
	private WebElement enterLastName;
	
	@FindBy(xpath = "//input[@placeholder='ENTER YOUR E-MAIL ID']")
	private WebElement enterEmailID;
	
	@FindBy(xpath = "//input[@placeholder='ENTER YOUR CONTACT NUMBER']")
	private WebElement enterContatactNumber;
	
	@FindBy(xpath = "//button[@class='seeForm']")
	private WebElement seeRecommendationbutton;
	
	public void clickOnFirstStep()
	{
		firstStep.click();
	}
	
	public void clickOnSecondStep()
	{
		secondStep.click();
	}
	
	public void clickOnThirdStep()
	{
		thirdStep.click();
	}
	
	public void clickOnFourthStep()
	{
		fourthStep.click();
	}
	
	public void clickOnFifthStep()
	{
		fifthStep.click();
	}
	
	public void clickOnSixthStep()
	{
		sixthStep.click();
	}
	
	public void clickOnSeventhStep()
	{
		seventhStep_OnlineInstructorLed.click();
	}
	
	public void enterFirstNameInField(String FirstName)
	{
		enterFirstName.sendKeys(FirstName);
	}
	
	public void enterLastNameInField(String LastName)
	{
		enterLastName.sendKeys(LastName);
	}
	
	public void enterEmailInField(String EmailAddress)
	{
		enterEmailID.sendKeys(EmailAddress);
	}
	
	public void enterContactNumberInField(String ContactNumber)
	{
		enterContatactNumber.sendKeys(ContactNumber);
	}
	
	public void clickOnSeeRecommendationbtn()
	{
		seeRecommendationbutton.click();
	}
}
