package org.parellel;

import org.testng.annotations.Test;

public class ParellelExp1 {
	@Test
	public void test()
	{
		System.out.println("test method "+Thread.currentThread().getId());
		
	}
	@Test
	public void test1()
	{
		System.out.println("test1 method "+Thread.currentThread().getId());
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 method  "+Thread.currentThread().getId());
		
	}

}
