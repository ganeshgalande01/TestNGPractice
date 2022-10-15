package org.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PartialDataProvideToMethod {
	
	@Test(dataProvider="testData")
	public void testLogin(String data)
	{
		

		System.out.println(data);
		
		
	

}
	
	@DataProvider(indices= {0,2}) //only 2 value provide to testlogin method
	
	public String[] testData()
	{
		String data[]= new   String [3];
		
		data[0]="admin";
		data[1]="hyr tutorials";
		data[2]="java tutorials";
		
		return data;
	}
	
}
