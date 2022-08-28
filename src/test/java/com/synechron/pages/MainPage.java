package com.synechron.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	private By patientLocator=By.xpath("//div[text()='Patients']");
	
	private WebDriver driver=null;
	
	public MainPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public String getMainPageTitle(WebDriver driver)
	{
		return driver.getTitle();
	}
	
	public void clickOnPatient(WebDriver driver)
	{
		driver.findElement(patientLocator).click();
	}

}
