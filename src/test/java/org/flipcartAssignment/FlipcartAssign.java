package org.flipcartAssignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcartAssign {

	public static void main(String[] args) throws Exception {
		
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
				 driver.get("https://www.flipkart.com/");
				 driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);// pop up remove
				driver.findElement(By.cssSelector("._3704LK")).sendKeys("iphone 12", Keys.ENTER);
			
				Thread.sleep(3000);
				String handle = driver.getWindowHandle();
				System.out.println(handle);

				WebElement tb = driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='_36fx1h _6t1WkM _3HqJxg']/div[@class='_1YokD2 _2GoDe3']/div[@class='_1YokD2 _3Mn1Gg']/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]"));

				System.out.println("price of this:" + tb.getText());

				driver.findElement(By.xpath("//div[normalize-space()='APPLE iPhone 12 (Black, 128 GB)']")).click();
				Thread.sleep(2000);
				Set<String> handle1=driver.getWindowHandles();
				for (String handle2 : handle1) {
					if(!handle2.equals(handle)) {
						 driver.switchTo().window(handle2);
						 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
									
						 
					
					 Actions actions = new Actions(driver);
					 WebElement element= driver.findElement(By.xpath("//button[normalize-space()='+']"));
					 actions.sendKeys(Keys.PAGE_DOWN).perform();
					 actions.moveToElement(element).build().perform();
					 actions.click(element).perform();
					 
					 Thread.sleep(4000);
					 
					 WebElement finalprice=driver.findElement(By.xpath("//span[contains(text(),'₹1,18,056')]"));
					
						System.out.println(finalprice.getText()); 
						 
						 
						 
					}
				
				   
				
			
					}
				}
		

	}


