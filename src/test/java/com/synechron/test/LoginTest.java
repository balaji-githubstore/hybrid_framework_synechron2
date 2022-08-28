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

		LoginPage.enterUsername(driver, username);
		test.log(Status.INFO, "Entered Username: "+username);
		
		LoginPage.enterPassword(driver, password);
		test.log(Status.INFO, "Entered Password: "+password);
		
		LoginPage.selectLanguageByText(driver, language);
		test.log(Status.INFO, "Selected Language: "+language);
		
		LoginPage.clickOnLogin(driver);
		test.log(Status.INFO, "Clicked on Login");

		// wait for page load
		String actualTitle = MainPage.getMainPageTitle(driver);
		test.log(Status.INFO, "Actual Title: "+actualTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider")
	public void invalidCredentialTest(String username,String password,String language,String expectedError) {

		LoginPage.enterUsername(driver, username);
		LoginPage.enterPassword(driver, password);
		LoginPage.selectLanguageByText(driver, language);
		LoginPage.clickOnLogin(driver);

		String actualError = LoginPage.getInvalidErrorMessage(driver);
		Assert.assertEquals(actualError, expectedError);
	}

}//will start at 2:05 PM IST
