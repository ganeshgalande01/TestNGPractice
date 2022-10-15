package org.invocation;

import org.testng.annotations.Test;

public class ThreadPoolsize {
	
	@Test(invocationCount=3, threadPoolSize=2)
	public void test()
	{
		System.out.println("test method" +Thread.currentThread().getId());
		
	}
	
	@Test()
	public void test1()
	{
		System.out.println("test 1 method" +Thread.currentThread().getId());
		
	}
	
}
