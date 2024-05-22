package practice.datadriventesting;

import org.testng.annotations.Test;

public class SeleniumTestReadDataFromRuntime {

	@Test
	public void runtimeParameterTest() {
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
System.out.println("Env Data ===>"+url);
System.out.println("Username Data ===>"+username);
System.out.println("Password Data ===>"+password);

//mvn -Dtest=SeleniumTestReadDataFromRuntime test -Durl=https://www.google.com -Dusername=john -Dpassword=John123
	}

}
