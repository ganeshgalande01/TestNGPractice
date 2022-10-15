package org.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class DataProviderExp2 {
	@Test(dataProvider="testData")
	public void actiLogin(String bname,String uname,String pass)
	{
		String url="http://localhost/login.do";
		WebDriver driver=BaseUtility.bs.startUpUsingWM(url, bname);
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	@DataProvider
	public Object[][] testData()
	{
	Object data[][]= {
			{"ch", "admin", "manager"},
			{"ff", "admin2", "manager12"},
			{"ed", "admin1", "manager1"}
			
					};
	
	return data;	
	}

}
