package com.greystar.crm.generic.fileUtility;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONUtility {
	public String getDataFromJSONFile(String key) throws Throwable {
		/*Step 1: Parse JSON Physical file into Java Object using JSONParse Class*/
		FileReader fileRObj = new FileReader("./configAppData/appCommonData.json");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(fileRObj);
		/*Step 2: Convert Java Object into JSONObject using Downcasting*/
		JSONObject map = (JSONObject) obj;
		/*Step 3: Get the value from JSON file using key*/
		String data = (String) map.get(key);
		return data;

	}

}
