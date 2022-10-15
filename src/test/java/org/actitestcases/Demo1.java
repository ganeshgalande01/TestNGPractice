package org.actitestcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

class Demo1{

@Test
public void browserLaunch()
{
	WebDriver driver=BaseUtility.bs.startUpUsingWM("https://www.google.com/","ch");

}

}

