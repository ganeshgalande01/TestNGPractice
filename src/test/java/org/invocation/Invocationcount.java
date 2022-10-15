package org.invocation;

import org.testng.annotations.Test;

public class Invocationcount {
	
	@Test(invocationCount=6 )
	
	public void test()
	{
		System.out.println("test method");
		
	}

}
