package com.Learning.PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recommendation {

	public Recommendation(WebDriver driver) 
	{
	  PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[3]/main/div[1]/div/div/div/div/div[1]/a/div/div[2]/div[4]/div[7]/p")
	private WebElement learnMore;
	
	
	public void clickOnLearnMore()
	{
		learnMore.click();
	}
}
