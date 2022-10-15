package org.ignoretestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcludeTestCases {
	
		@Test
		
		
		public void launchGoogle()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("http://www.google.com/");
			driver.close();
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


	
	@Test(enabled=false) // here this method is skip from execution
	public void test1()
	{
		System.out.println("Test1 method");
		
	}
	@Ignore // here this method is skip from execution
	@Test
	public void test2()
	{
		System.out.println("Test2 method");
		
	}

}
