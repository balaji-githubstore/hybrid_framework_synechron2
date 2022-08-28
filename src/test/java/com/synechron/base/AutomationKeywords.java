package com.synechron.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationKeywords {
	
	private WebDriver driver;
	
	public AutomationKeywords(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsingLocator(By locator,String text)
	{
		driver.findElement(locator).sendKeys(text);
	}

	public void clickUsingLocator(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public String getTextUsingLocator(By locator)
	{
		return driver.findElement(locator).getText().strip();
	}
	
	public void selectDropdownUsingText(By locator,String text)
	{
		Select selectLan = new Select(driver.findElement(locator));
		selectLan.selectByVisibleText(text);
	}
	
}
