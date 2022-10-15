package org.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeSuiteAnnotation {

	WebDriver driver;
	
	@BeforeTest
	
	public void inisilizeBrowser()
	{	WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		System.out.println("before test");
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		System.out.println("after test");
	}
	
	@Test
	public void launchGoogle()
	{
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void verifyGoogleTitle()
	{
		driver.get("https://www.google.com/");
		SoftAssert softassert = new SoftAssert(); 
		softassert.assertEquals(driver.getTitle(), "Google","Title is not match");
		
		softassert.assertAll();
	}
	
	

}
