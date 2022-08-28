package com.synechron.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	private static By patientLocator=By.xpath("//div[text()='Patients']");
	
	
	public static String getMainPageTitle(WebDriver driver)
	{
		return driver.getTitle();
	}
	
	public static void clickOnPatient(WebDriver driver)
	{
		driver.findElement(patientLocator).click();
	}

}
