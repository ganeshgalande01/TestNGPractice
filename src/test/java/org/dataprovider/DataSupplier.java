package org.dataprovider;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	
	public String[] testData()
	{
		String data[]= new   String []
				{"admin","purchase","hr","Sales"};
		
//		data[0]="admin";
//		data[1]="hyr tutorials";
//		data[2]="java tutorials";
		
		return data;
	}
	@DataProvider
	public String[] testData1()
	{
		String data[]= new   String [3];
		
		data[0]="java tutorials";
		data[1]="hyr tutorials";
		data[2]="java with selenium";
		
		return data;
	}

}
