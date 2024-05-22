package practice.pom.repository;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class POMPracticeDependsOnandPriorityTest {
	@Test(priority = -1)
	public void createContactTest() {
		Reporter.log("========Create Contact Start========", true);
		Reporter.log("Enter Uname and Enter Password", true);
		Reporter.log("Click Create Contact", true);
		Reporter.log("Enter Details", true);
		Reporter.log("Click Create Button", true);
		Reporter.log("Logout of Application", true);
		// String s=null;
		// System.out.println(s.equals("Hello"));
		Reporter.log("========Create Contact End========", true);
	}

	@Test(dependsOnMethods = "createContactTest")
	void modifyContactTest() {
		Reporter.log("========Modify Contact Start========", true);
		Reporter.log("Enter Uname and Enter Password", true);
		Reporter.log("Click Edit Contact", true);
		Reporter.log("Update Details", true);
		Reporter.log("Click Update Button", true);
		Reporter.log("Logout of Application", true);
		Reporter.log("========Modify Contact End========", true);
	}

	@Test(dependsOnMethods = "modifyContactTest")
	public void deleteContactTest() {
		Reporter.log("========Delete Contact Start========", true);
		Reporter.log("Enter Uname and Enter Password", true);
		Reporter.log("Select Contact", true);
		Reporter.log("Click Delete Button", true);
		Reporter.log("Check Contact Deleted Popup message comes", true);
		Reporter.log("Logout of Application", true);
		Reporter.log("========Delete Contact End========", true);
	}
}
