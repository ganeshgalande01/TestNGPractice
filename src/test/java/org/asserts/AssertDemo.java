package org.asserts;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

// hard example
public class AssertDemo {
	@Test
	public void testGoogleTitle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com/");
		assertEquals(driver.getTitle(), "Google" );
		driver.close();
		
	}

}

// different assert methods
// assertNotEquals
//assertTrue
//assertFalse
