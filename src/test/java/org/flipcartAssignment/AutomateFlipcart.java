package org.flipcartAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateFlipcart {
	
	@Test
	public void testFlipcart() throws Exception {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone11",Keys.ENTER);
	Thread.sleep(3000);
	String handle= driver.getWindowHandle();
	System.out.println(handle);
	driver.findElement(By.xpath("//div[normalize-space()='APPLE iPhone 11 (White, 64 GB)']")).click();
	
	//driver.findElement(By.name("New Message Window")).click();
	Set handles = driver.getWindowHandles();
	System.out.println(handles);
	for (String handle1 : driver.getWindowHandles()) {
	    System.out.println(handle1);
	    driver.switchTo().window(handle1);
	}
	System.out.println(driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText());
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[normalize-space()='+']")).click();
	System.out.println(driver.findElement(By.xpath("//span[contains(text(),'₹94,056')]")).getText());
	
	
	
	
	
	
	

}}
