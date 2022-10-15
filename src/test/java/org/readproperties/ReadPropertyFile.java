package org.readproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public String getDataFromProperty(String key) throws IOException
	{
	FileInputStream file= new FileInputStream("C:\\Users\\GANESH\\eclipse-workspace\\TestNgPractice\\propertiesfiles\\config.properties");
		Properties pr= new Properties();
		pr.load(file);
		
		return pr.getProperty(key);
	}

}
