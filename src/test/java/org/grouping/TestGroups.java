package org.grouping;

import org.testng.annotations.Test;

public class TestGroups {
	@Test(groups={"smoke","Sanity"})
	public void test1()
	{
		System.out.println("Test 1 method");
	}
	
	@Test(groups={"smoke","Sanity"})
	public void test2()
	{
		System.out.println("Test 2 method");
	}
	
	@Test(groups={"smoke","Sanity"})
	public void test3()
	{
		System.out.println("Test 3 method");
	}
	@Test
	public void test4()
	{
		System.out.println("Test 4 method");
	}
	@Test(groups={"smoke"})
	public void test5()
	{
		System.out.println("Test 5 method");
	}
	@Test(groups={"smoke"})
	public void test6()
	{
		System.out.println("Test 6 method");
	}
	@Test(groups={"smoke"})
	public void test7()
	{
		System.out.println("Test 7 method");
	}
	@Test(groups={"smoke"})
	public void test8()
	{
		System.out.println("Test 8 method");
	}
	@Test(groups={"smoke"})
	public void test9()
	{
		System.out.println("Test 9 method");
	}
}
