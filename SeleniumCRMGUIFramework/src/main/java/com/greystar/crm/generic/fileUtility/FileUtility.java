package com.greystar.crm.generic.fileUtility;

import java.io.FileInputStream;
import java.util.Properties;
/**
 * @author John
 */
public class FileUtility {
	public String getDataFromPropertiesFile(String key) throws Throwable {
		/**
		 * step 1: Get the Java representation object of the physical file
		 */
		FileInputStream fis = new FileInputStream("./configAppData/commonData.properties");
		Properties pObj = new Properties();
		/**
		 * Step 2: Using Properties Class Load all the keys
		 */
		pObj.load(fis);
		
		/**
		 * Get the Value Based on keys
		 */
		String data= pObj.getProperty(key);
		
		
		return data;
		
		
		
		
	}

}
