package org.prority;

import org.testng.annotations.Test;

public class ProrityExp1 {
	@Test(priority=1)
	public void test1()
	{
		System.out.println("Test 1 method");
	}
	@Test
	public void test2()
	{
		System.out.println("Test 2 method");
	}
	@Test(priority=2)
	public void test3()
	{
		System.out.println("Test 3 method");
	}
	
	
	@Test(priority=-3)
	public void test4()
	{
		System.out.println("Test 4 method");
	}
	@Test(priority=0)
	public void Test5()
	{
		System.out.println("Test 5 method");
	}

}
