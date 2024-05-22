package practice.datadriventesting;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSONTest {

	public static void main(String[] args) throws Throwable, IOException, ParseException {
		//Step 1: Parse JSOn physical file into java object using JSON Parse Class
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(
				"D:\\TestYantraTraining\\SeleniumCRMGUIFramework\\src\\test\\resources\\appCommonData.json"));
		//Step 2: Convert Java Object to JSON Object using down casting
		JSONObject map = (JSONObject) obj;
		// Get value from JSON file Using Key
		System.out.println(map.get("url"));
		System.out.println(map.get("browser"));
		
		
	//	String URL = (String) map.get("url"); Up Caste
	//	String URL1 = map.get("url").toString();
		//or in step 1
	
		
	}

}
