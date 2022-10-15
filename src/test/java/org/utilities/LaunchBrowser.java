package org.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static WebDriver startUp(String url,String browsername)
	{
		WebDriver driver=null;
		if(browsername.equalsIgnoreCase("Chrome") || browsername.equalsIgnoreCase("ch"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox") || browsername.equalsIgnoreCase("ff"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("edge") || browsername.equalsIgnoreCase("ed"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

}
