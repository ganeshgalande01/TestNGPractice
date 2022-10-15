package org.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExp1 {
	@Test(dataProvider="testData")
	public void getData( String bname,String uname, String pass  )
	{
		System.out.println("browsername "+bname);
		System.out.println("username "+uname);
		System.out.println("password "+pass);
	
		
		
	}
	
	@DataProvider
	public Object[][] testData()
	{
		Object [][]data= new Object[][]
				{
			{"ch","admin","manager"},
			{"ed","admin1","manager1"},
			{"ff","admin2","manager12"}
			};
	
		return data;
		
	}
	

}
