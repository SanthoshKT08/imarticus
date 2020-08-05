package com.Learning.PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Programs {
	
	public Programs(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='ImarMenu dropdown dropbtn DesktopProgram nav-link']")
	public WebElement programs;
	
	@FindBy(xpath = "//p[@class='MegaMenuDetails'][contains(text(),'Investment Banking Operations')]")
    private WebElement investmentBankingOperation;	
	
	@FindBy(xpath = "//p[contains(text(),'Banking And Wealth Management')]")
	private WebElement BankingAndWealthMangement;
	
	@FindBy(xpath = "//*[@id=\"basic-navbar-nav\"]/div/a[5]/div/div/div[2]/div[1]/ul/li[2]/a[1]/p")
	private WebElement financialAnalysisWithKPMG;
	
	@FindBy(xpath = "//*[@id=\"basic-navbar-nav\"]/div/a[5]/div/div/div[2]/div[1]/ul/li[2]/p[2]")
	private WebElement professionalCertificationInFintech;
	
	@FindBy(xpath = "//p[contains(text(),'Credit Risk and Underwriting with Moody')]")
	private WebElement creditRiskAndUnderwritingWithMoody;
	
	@FindBy(xpath = "//p[contains(text(),'New Age Banking')]")
	private WebElement newAgeBanking;
	
	@FindBy(xpath = "//p[@class='MegaMenuDetails'][contains(text(),'Capital Markets')]")
	private WebElement capitalMarkets;
	
	@FindBy(xpath = "//p[contains(text(),'Finance and Accounts')]")
	private WebElement financeAndAccounts;
	
	
	public void clickOnInvestmentBankingOperation()
	{
		investmentBankingOperation.click();
	}
	
	public void clickOnBankingAndWealthMangement()
	{
		BankingAndWealthMangement.click();
	}
	
	public void clickOnFinancialAnalysisWithKPMG()
	{
		financialAnalysisWithKPMG.click();
	}
	
	public void clickOnprofessionalCertificationInFintech()
	{
		professionalCertificationInFintech.click();
	}
	
	public void clickOncreditRiskAndUnderwritingWithMoody()
	{
		creditRiskAndUnderwritingWithMoody.click();
	}
	
	public void clickOnNewAgeBanking()
	{
		newAgeBanking.click();
	}
	
	public void clickOnCapitalMarkets()
	{
		capitalMarkets.click();
	}
	
	public void clickOnFinanceAndAccounts()
	{
		financeAndAccounts.click();
	}
	
}
