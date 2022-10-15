package org.parellel;

import org.testng.annotations.Test;

public class ParellelExp3 {
	@Test
	public void test6()
	{
		System.out.println("test6 method "+Thread.currentThread().getId());
		
	}
	@Test
	public void test7()
	{
		System.out.println("test7 method "+Thread.currentThread().getId());
		
	}

}
