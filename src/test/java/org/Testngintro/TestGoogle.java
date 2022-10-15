package org.Testngintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGoogle {
	@Test
	public void launchGoogle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.close();
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before Suite");
	}
	
	@Test
	public void verifygoogleTitle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com/");
		if(driver.getTitle().equals("Google"))
		{
			System.out.println("Google Title is Match");
		}
		else {
			System.out.println("Google Title not Match");
			}
		driver.close();
		
	}

}
