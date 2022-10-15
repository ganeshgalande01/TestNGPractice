package org.asserts;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExp {	
	
		@Test
		public void stringCompare()
		{
			SoftAssert as= new SoftAssert();
			String str="Welcome";
			as.assertEquals(str,"Welcom e","String is not match");
			
			int arr[]= {10,30,49};
			as.assertEquals(arr.length,3,"Array length not match");
			System.out.println("Array length is match");
			as.assertAll();
		}

}
