package org.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Utils {
	Utils ut=new Utils();
	WebDriver driver;
	
	private By  useremail=By.xpath("//input[@placeholder='Email']");
	private By userpass =By.xpath("//input[@id='signin-password']");
	private By loginbtn=By.xpath("//div[@id='normal-login']");
	
	LoginPage(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	public void setuserName(String uname)
	{
		driver.findElement(useremail).sendKeys(uname);
	}
	
	public void setPassword(String pass)
	{
		driver.findElement(userpass).sendKeys(pass);
	}
	
	public void clickOnLoginbtn()
	{
//		driver.findElement(loginbtn).click();
		ut.waitForElement(5, loginbtn, driver).click();
		
	}

}
