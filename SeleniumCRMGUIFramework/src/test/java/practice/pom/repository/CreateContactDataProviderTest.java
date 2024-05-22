package practice.pom.repository;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContactDataProviderTest {
	@Test(dataProvider = "getData")
	public void createContactTest(String firstName, String lastName, long phNo) {
		System.out.println("Firstname= " + firstName + ", LastName:" + lastName+", Phone Number:" + phNo);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] objArr = new Object[3][3];
		objArr[0][0] = "John";
		objArr[0][1] = "Mavileth";
		objArr[0][2] = 8140661601L;
		objArr[1][0] = "Deepak";
		objArr[1][1]= "HR";
		objArr[1][2] = 8140666111L;
		objArr[2][0] = "Prakash";
		objArr[2][1]= "Sir";
		objArr[2][2] = 8140666190L;
		return objArr;

	}
}
