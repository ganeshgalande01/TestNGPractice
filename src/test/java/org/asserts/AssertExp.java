package org.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExp {
	@Test
	public void stringCompare()
	{
		String str="Welcome";
		Assert.assertEquals(str,"Welcom e","String is not match");
		
		int arr[]= {10,30,49};
		Assert.assertEquals(arr.length,4,"Array length not match");
	}

}
