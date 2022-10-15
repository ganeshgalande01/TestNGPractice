package org.utilities;



import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtility {
	public static BaseUtility bs= new BaseUtility();
	public  WebDriver startUp(String browsername)
	{
		
		WebDriver driver=null;
		if(browsername.equalsIgnoreCase("chrome") || browsername.equalsIgnoreCase("ch"))
		{
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		 }
		
		 
		 else if(browsername.equalsIgnoreCase("firefox") || browsername.equalsIgnoreCase("ff"))
		 {
		  
			 System.setProperty("webdriver.gecko.driver","D:\\Software\\geckodriver.exe");
			 driver= new FirefoxDriver();
			 
		 }  
		driver.manage().window().maximize();
		
		return driver;
		 
		
	}
	
	public  WebDriver startUpUsingWM(String url,String browsername)
	{
		
		WebDriver driver=null;
		if(browsername.equalsIgnoreCase("chrome") || browsername.equalsIgnoreCase("ch"))
		{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		
		 }
		
		 
		 else if(browsername.equalsIgnoreCase("firebox") || browsername.equalsIgnoreCase("ff"))
		 {
		 
			 WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
			 
		 } 
		
		 else if(browsername.equalsIgnoreCase("edge") || browsername.equalsIgnoreCase("ed"))
		 {
		 
			 WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver();
			 
		 }
		driver.get(url);
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(200,200) );
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		 
		
	}
	public void isAlertPresent(WebDriver driver, int time)
	{
		WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.alertIsPresent());
	}
	
	public void isClickable(WebDriver driver, int time, WebElement ele)
	{
		WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	
	
	

}
