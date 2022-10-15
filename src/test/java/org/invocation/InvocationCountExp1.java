package org.invocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;



public class InvocationCountExp1 {
	@Test(invocationCount=2 ,threadPoolSize=2)
	public void actiLoginWithED()
	{
		String url="http://localhost/login.do";
		WebDriver driver=BaseUtility.bs.startUpUsingWM(url, "ed");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println("actiLoginWithED "+Thread.currentThread().getId());
		
	}
	@Test
	public void actiLoginWithCH()
	{
		String url="http://localhost/login.do";
		WebDriver driver=BaseUtility.bs.startUpUsingWM(url, "ch");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
	@Test
	public void actiLoginWithFF()
	{
		String url="http://localhost/login.do";
		WebDriver driver=BaseUtility.bs.startUpUsingWM(url, "ff");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
}
