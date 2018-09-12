package com.GitHub.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.GitHub.Util.BaseClass;

import TestCases.SearchTest;

public class ValidateSearchFunctionality extends BaseClass {

	

	@Test
	public void TestSearchFunctionalityOfGitHub() {
		
		 SearchTest searchtest = new SearchTest(driver);
		searchtest.SearchTextinGitHub();
		searchtest.ValidateRepoCount();
		searchtest.ClickOnCapitalone();
		searchtest.ValidateHeaders();
		searchtest.validateCountOfHeader();
	}

}
