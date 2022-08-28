package com.synechron.pages;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.WebDriver;

import com.synechron.base.AutomationKeywords;

public class SearchOrAddPatientPage extends AutomationKeywords{

	private WebDriver driver = null;

	public SearchOrAddPatientPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}
