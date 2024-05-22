package com.greystar.crm.contactTest;

import com.greystar.crm.generic.fileUtility.ExcelUtility;
import com.greystar.crm.generic.fileUtility.FileUtility;
import com.greystar.crm.generic.fileUtility.JSONUtility;
import com.greystar.crm.generic.webDriverUtility.JavaUtility;

public class SearchLondonPropertyTest {
public static void main(String[] args) throws Throwable {
	/**
	 * Create Object of File Utility
	 */
	FileUtility fLib = new FileUtility();
	ExcelUtility eLib= new ExcelUtility();
	JSONUtility jLib= new JSONUtility();
	JavaUtility jUtil=new JavaUtility();
	System.out.println(jUtil.getRandomNumber());
	System.out.println(jUtil.getSystemDateYYYYDDMM());
	System.out.println(jUtil.getExtendedDateByDays(30));
	
	String BROWSER=fLib.getDataFromPropertiesFile("browser");
	String URL=jLib.getDataFromJSONFile("url");
	String LOCATION=eLib.getStringDataFromExcel("greystar", 2, 1);
	System.out.println(URL);
	System.out.println(LOCATION);
	
	
}
}
