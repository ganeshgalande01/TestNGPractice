package org.asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
// softassert example
// softassert not stop the execution when assert is fail
public class SoftAssertDemo {
	WebDriver driver;
	@Test
	public void softAssert()
	{
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	
	// verify Title
	SoftAssert softassert= new SoftAssert();
	softassert.assertEquals(driver.getTitle(),"Google", "Title is not match" );
	
	// verify error msg
	String str="Welcome";
		
	softassert.assertEquals(str, "Welcome","String is not match");
	System.out.println("program end");		
	softassert.assertAll();
	
	}

}
