package org.Testngintro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFacebook {
	WebDriver driver=null;
	@Test
	public void launchFacebook()
	{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		//driver.get("http://www.facebook.com/");
		driver.navigate().to("http://www.facebook.com/");
		
	}
	@Test
	public void verifyTitle()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://www.facebook.com/");
		if(driver.getTitle().equals("Facebook � log in or sign up"))
		{
			System.out.println("title is match");
		}
		
		else {
			System.out.println("title is not match");
		}
	}
	
	
	

}
