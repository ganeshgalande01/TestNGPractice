package org.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParameterExp {
	@Test
	@Parameters({"browsername","username","password"})
	public void actiLoginWithED(String bname,String uname, String pass)
	{
		String url="http://localhost/login.do";
		WebDriver driver=BaseUtility.bs.startUpUsingWM(url, bname);
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println("actiLoginWithED " +Thread.currentThread().getId());
		
		
	}

}
