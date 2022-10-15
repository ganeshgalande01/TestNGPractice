package org.pommodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiLoginPage {
	WebDriver driver;
	// 1. WebElements
	@FindBy(name="username")
	private WebElement uNametxtfield;
	
	@FindBy(name="pwd")
	private WebElement pwdtxtfield;
	
	@FindBy(xpath="//*[text()='Login ']")
	private WebElement loginbtn;
	
	
	// 2. Constructor
	public ActiLoginPage(WebDriver driver)
	{
		//PageFactory.initElements(driver, ActiLoginPage.class);
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	// 3. Action/operation methods
	public boolean isuntxtFieldDispalyed()
	{
		return uNametxtfield.isDisplayed();
	}
	
	public boolean ispasstxtFieldDispalyed()
	{
		return pwdtxtfield.isDisplayed();
	}
	
	public boolean isloginbtnDispalyed()
	{
		return loginbtn.isDisplayed();
	}
	
	public void setUserName(String uname)
	{
		//uNametxtfield.sendKeys(uname);
		uNametxtfield.sendKeys("admin");
	}
	
	
	
	public void setPassword(String pass)
	{
		//uNametxtfield.sendKeys(pass);
		pwdtxtfield.sendKeys("manager");
	}
	public void clickLoginbtn()
	{
		
		loginbtn.click();
		
	}
	

}
