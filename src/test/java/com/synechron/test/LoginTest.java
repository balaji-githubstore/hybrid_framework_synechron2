package com.synechron.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.synechron.base.AutomationWrapper;
import com.synechron.pages.LoginPage;
import com.synechron.pages.MainPage;
import com.synechron.utilities.DataUtils;


//ctrl+shift+i+o   - remove unwanted imports

public class LoginTest extends AutomationWrapper {
	
	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void validCredentialTest(String username,String password,String language,String expectedTitle) {

		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.enterUsername( username);
		test.log(Status.INFO, "Entered Username: "+username);
		
		loginPage.enterPassword(password);
		test.log(Status.INFO, "Entered Password: "+password);
		
		loginPage.selectLanguageByText(language);
		test.log(Status.INFO, "Selected Language: "+language);
		
		loginPage.clickOnLogin();
		test.log(Status.INFO, "Clicked on Login");

		MainPage mainPage=new MainPage(driver);
		// wait for page load
		String actualTitle = mainPage.getMainPageTitle(driver);
		test.log(Status.INFO, "Actual Title: "+actualTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void invalidCredentialTest(String username,String password,String language,String expectedError) {

		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername( username);
		loginPage.enterPassword( password);
		loginPage.selectLanguageByText( language);
		
		loginPage.clickOnLogin();
		test.log(Status.INFO, "Clicked on Login");
		String actualError = loginPage.getInvalidErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}

}