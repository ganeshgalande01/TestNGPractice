package org.annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameters {

	WebDriver driver;
	@Parameters("browsername")
	@BeforeTest
	public void inisilizeBrowser(String browsername)
	{	switch (browsername) 
		{
	case  "chrome":
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		break;
		
		case  "edge" :
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
	default:System.err.println("browser name is invalid");
		break;
	}
		
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	@Parameters("url")
	@Test
	public void launchGoogle(String url)
	{
		driver.get(url);
	}
	
	@Test
	public void verifyGoogleTitle()
	{
		
		driver.get("http://www.google.com/");
		SoftAssert softassert = new SoftAssert(); 
		softassert.assertEquals(driver.getTitle(), "Google","Title is not match");
		softassert.assertAll();
	}
	
	

}
