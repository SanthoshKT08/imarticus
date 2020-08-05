package com.Learning.PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Learning.Generics.FileUtilities;

public class ThankYouPage {
	
	public ThankYouPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[3]/main/div/div/div/div[2]/div/div/div[8]/button/span")
	private WebElement submitYourEnquiry;
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[3]/main/div/div/div[2]/div/div[4]/button")
	private WebElement done;
	
	public void clickOnSubmitYourEnquiry(WebDriver driver) throws InterruptedException
	{
		FileUtilities.scrollPage(driver, "window.scrollBy(0,600)", "");
		
		Thread.sleep(1000);
		
		FileUtilities.handleElementClickInterceptedException(driver, submitYourEnquiry);
	}
	
	public void clickOnDone()
	{
		done.click();
	}

}
