package com.Learning.PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Learning.Generics.FileUtilities;

public class Career {

	public Career(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='ImarMenu MobileNavItem dropdown2 dropbtn2 nav-link']")
	private WebElement career;
	
	@FindBy(xpath = "//a[contains(text(),'Career Services')]" )
	private WebElement careerServices;
	
	@FindBy(xpath = "//a[contains(text(),'Placement')]")
	private WebElement placement;
	
	@FindBy(xpath = "//a[contains(text(),'Mentorship')]")
	private WebElement mentorship;
	
	@FindBy(xpath = "//a[contains(text(),'Hackathon')]" )
	private WebElement hackathon;
	
	@FindBy(xpath = "//a[contains(text(),'Imarticus Networking')]")
	private WebElement imarticusNetworking;
	
	@FindBy(xpath = "//a[contains(text(),'Alumni Benefits')]" )
	private WebElement aluminiBenefits;
	
	@FindBy(xpath = "//a[contains(text(),'Testimonials')]")
	private WebElement testimonials;
	
	public void moveToCareer(WebDriver driver)
	{
		FileUtilities.actionClass(driver, career);
	}
	
	public void ClickOnCareerServices()
	{
		careerServices.click();
	}
	
	public void VerifyTextMessage(WebDriver driver)
	{
		FileUtilities.verifyTextMessage(driver, "//p[text()=\"Your career success starts here\"]", "Your career success starts here");
	}
	
	public void VerifyTitlePage(WebDriver driver)
	{
		FileUtilities.verifyTitlePage(driver, "Career Services, Career Coaching - Imarticus Learning");
	}

}
