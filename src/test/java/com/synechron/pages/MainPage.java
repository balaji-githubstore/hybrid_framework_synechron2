package com.synechron.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.synechron.base.AutomationKeywords;

public class MainPage extends AutomationKeywords {
	private By patientLocator=By.xpath("//div[text()='Patients']");
	
	private WebDriver driver=null;
	
	public MainPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}

	
	public String getMainPageTitle(WebDriver driver)
	{
		return driver.getTitle();
	}
	
	public void clickOnPatient(WebDriver driver)
	{
		clickUsingLocator(patientLocator);
	}

}
