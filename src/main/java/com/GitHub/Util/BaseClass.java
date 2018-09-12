package com.GitHub.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.Before;

public class BaseClass {
	
	public  WebDriver driver;
	@BeforeMethod
	public void Initmethod(){
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();
		driver.get("https://github.com");
	}
}
