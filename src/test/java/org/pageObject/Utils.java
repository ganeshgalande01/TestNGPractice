package org.pageObject;

import java.io.File;
import java.time.Duration;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utils extends BaseClass {
	
	public static  void captureScreenshot()
	{
		try {
			Date date= new Date();
			String str=date.toString();
			str=str.replaceAll(" ", "-");
			String str1=str.replaceAll(":", "-");
		    TakesScreenshot ts= (TakesScreenshot) driver;
		    File src=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\GANESH\\eclipse-workspace\\TestNgPractice\\src\\test\\java\\org\\pageObject\\"+str1+".png"));
			}
			catch(Exception e) {}
		  
		}
	
	

	public WebElement waitForElement(int timeout, By element,WebDriver driver )
		{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
		
		return driver.findElement(element);
		
	}
	}


