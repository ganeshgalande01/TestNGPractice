package org.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExp {
	// data access from another class of method using dataprovider
	
	@Test(dataProvider="testData1", dataProviderClass=DataSupplier.class)
	public void testLogin(String data)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(data, Keys.ENTER);

		System.out.println(driver.getTitle());
		
		driver.close();
	

}
	
	
	
}
