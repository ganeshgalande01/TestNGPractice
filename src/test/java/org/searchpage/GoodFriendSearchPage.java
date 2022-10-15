package org.searchpage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoodFriendSearchPage {
	
	@Test
	public void searchGoodFreind() throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://staging--goodfriend-web.netlify.app/");
	
	WebElement searchfield =driver.findElement(By.id("google-api-autocomplete"));
	
	
	searchfield.click();
	searchfield.clear();
	searchfield.sendKeys("Chicago");
	Thread.sleep(1000);
	
	
	searchfield.sendKeys(Keys.ARROW_DOWN);
	
	Thread.sleep(1000);
	searchfield.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	
	//assert(searchfield.getText().equals("Chicago"));
	
	Actions act= new Actions (driver);
	WebElement services =driver.findElement(By.xpath("//div[@class='gfx-select__indicators css-1wy0on6']"));
	act.click(services).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ENTER).perform();
	
	Thread.sleep(1000);
	
		
	
	driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
	
	Thread.sleep(1000);
	System.out.println(driver.getPageSource().contains("GROOMING"));
	
	//driver.close();

}
}
