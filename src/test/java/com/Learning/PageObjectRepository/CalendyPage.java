package com.Learning.PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendyPage {

	public CalendyPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'29')]")
	private WebElement selectDate;
	
	@FindBy(xpath = "//button[@data-start-time=\"11:00am\"]")
	private WebElement selectTime;
	
	@FindBy(xpath = "//button[@class='styles-ConfirmButton__cls1___1Xg-U styles-ConfirmButton__selected___3X568 styles-SpotButton__cls1___2vImR BareButton__cls1___1Qg-r index-UnstyledButton__cls1___2zIir confirm-button-enter-done']")
	private WebElement confirm;
	
	@FindBy(xpath = "//input[@name='full_name']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='question_0']")
	private WebElement contactNumber;
	
	@FindBy(xpath = "//div[contains(text(),'Delhi')]")
	private WebElement selectLocation;
	
	@FindBy(xpath = "//div[contains(text(),'Online Instructor led')]")
	private WebElement selectModeOfLearning;
	
	@FindBy(xpath = "//textarea[@name='question_3']")
	private WebElement messagefield;
	
	@FindBy(xpath = "//input[@name='phone_number']")
	private WebElement phoneNumberRemainderTo;
	
	@FindBy(xpath = "//div[@class='styles-TextContainer__cls1___OPKSe']")
	private WebElement scheduleEvent;
	
	
	
	public void clickOnDate()
	{
		selectDate.click();
	}
	
	public void clickOnTime()
	{
		selectTime.click();
	}
	
	public void clickOnConfirm()
	{
		confirm.click();
	}
	
	public void enterFullFirst(String fullName)
	{
		name.sendKeys(fullName);
	}
	
	public void enterEmail(String emailID)
	{
	     email.sendKeys(emailID);
	}
	
	public void enterContactNumber(String number)
	{
		contactNumber.sendKeys(number);
	}
	
	public void clickOnSelectLocation()
	{
		selectLocation.click();
	}
	
	public void clickOnModeOfLearning()
	{
		selectModeOfLearning.click();
	}
	
	public void enterMessage(String message)
	{
		messagefield.sendKeys(message);
	}
	
	public void enterTextRemainderPhoneNumber(String PhoneNumber)
	{
		phoneNumberRemainderTo.sendKeys(PhoneNumber);
	}
	
	public void clickOnScheduleEvent()
	{
		scheduleEvent.click();
	}
}
