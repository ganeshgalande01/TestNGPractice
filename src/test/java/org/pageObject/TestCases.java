package org.pageObject;
import java.io.IOException;

import org.readproperties.ReadPropertyFile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends BaseClass  {
	
	
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		ReadPropertyFile read = new ReadPropertyFile();
		driver.get("https://user.mockplus.com/signin?next=https://www.mockplus.com/blog/post/login-page-examples");
		LoginPage lp= new LoginPage(driver );
		lp.setuserName(read.getDataFromProperty("email"));
		lp.setPassword(read.getDataFromProperty("pass"));
		lp.clickOnLoginbtn();		
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "40 Best Login Page Examples and Responsive Templates [FREE DOWNLOAD]","Title not match");	
	
	}
	
	
	
	

}
