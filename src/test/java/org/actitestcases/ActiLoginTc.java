package org.actitestcases;

import org.openqa.selenium.WebDriver;
import org.pommodel.ActiLoginPage;
import org.readproperties.ReadPropertyFile;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ActiLoginTc {
	
	
	
	
	WebDriver driver;
	 
	ReadPropertyFile rp= new ReadPropertyFile();
	
	@BeforeMethod
	public void launchBrowser() throws Exception
		{
		
		//String url=rp.getDataFromProperty("url");
		//String bname=rp.getDataFromProperty("browsername");
		//driver=BaseUtility.bs.startUpUsingWM(url, bname);
		driver=BaseUtility.bs.startUpUsingWM(rp.getDataFromProperty("url"), rp.getDataFromProperty("browsername"));
		
		}
	
	@Test
	public void loginTest() throws Exception
	{		
		ActiLoginPage act_obj= new ActiLoginPage(driver);
		act_obj.isuntxtFieldDispalyed();
		System.out.println(act_obj.isuntxtFieldDispalyed());
		
		act_obj.ispasstxtFieldDispalyed();
		System.out.println(act_obj.ispasstxtFieldDispalyed());
		
		act_obj.isloginbtnDispalyed();
		System.out.println(act_obj.isloginbtnDispalyed());
		
		act_obj.setUserName(rp.getDataFromProperty("username"));
		
		act_obj.setPassword(rp.getDataFromProperty("password"));
		act_obj.clickLoginbtn();
		
		
		
	}

}
