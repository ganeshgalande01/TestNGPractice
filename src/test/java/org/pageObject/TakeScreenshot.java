package org.pageObject;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class TakeScreenshot extends Utils implements ITestListener {
	
	
	
	public  void onTestFailure(ITestResult result)  {
		
		captureScreenshot();
}
}
