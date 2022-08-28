package com.synechron.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.synechron.base.AutomationKeywords;

public class LoginPage extends AutomationKeywords{

	private By usernameLocator = By.id("authUser");
	private By passwordLocator = By.cssSelector("#clearPass");
	private By languageLocator = By.cssSelector("select[name='languageChoice']");
	private By loginLocator = By.id("login-button");
	private By errorLocator = By.xpath("//div[contains(text(),'Invalid')]");
	
	private WebDriver driver=null;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}

	public void enterUsername(String username) {
		enterUsingLocator(usernameLocator, username);
	}

	public void enterPassword(String password) {
		enterUsingLocator(passwordLocator, password);
	}

	public void selectLanguageByText(String language) {
		selectDropdownUsingText(languageLocator, language);
	}

	public void clickOnLogin() {
		clickUsingLocator(loginLocator);
	}

	public String getInvalidErrorMessage() {
		return getTextUsingLocator(loginLocator);
	}

}
