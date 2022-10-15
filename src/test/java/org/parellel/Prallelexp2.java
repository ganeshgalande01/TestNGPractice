package org.parellel;

import org.testng.annotations.Test;

public class Prallelexp2 {
	@Test
	public void test3()
	{
		System.out.println("test3 method "+Thread.currentThread().getId());
		
	}
	@Test
	public void test4()
	{
		System.out.println("test4 method "+Thread.currentThread().getId());
		
	}

}
