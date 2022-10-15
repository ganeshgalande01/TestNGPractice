package org.flipcartAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EscortSubMenu {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Live Scores']"))).perform();
		List<WebElement> submenu=driver.findElements(By.xpath("//div[1]/ul[1]/li"));
			
		for(WebElement ele:submenu) {
			
			System.out.println(ele.getText());
		}
		
		driver.quit();
		

	}

}
