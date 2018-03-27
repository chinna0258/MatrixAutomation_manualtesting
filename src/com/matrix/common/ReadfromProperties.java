package com.matrix.common;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadfromProperties {
	
	public String getorproperties(String object) throws Exception{
		
		FileInputStream fs=new FileInputStream("./properti/or.properti");
		
		Properties or=new Properties();
		
		or.load(fs);
		return or.getProperty(object);
	}

}
