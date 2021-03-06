package com.BDD_Junit_GenericLib;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib 
{
	public String getPropertyKV(String key)
	{
		Properties prop = null;
		try 
		{
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\BDD_Junit_CommonData\\commonData.properties");
			prop = new Properties();
			prop.load(ip);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
}
