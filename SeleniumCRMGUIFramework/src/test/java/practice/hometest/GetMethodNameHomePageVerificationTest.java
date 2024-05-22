package practice.hometest;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetMethodNameHomePageVerificationTest {
@Test
public void homePageTest(Method mtd) {//Method from Reflect method to get the method name
	SoftAssert sa = new SoftAssert();
	System.out.println("====Test Case ===="+mtd.getName()+"==== Started Execution===");
	System.out.println("Step - 1 ");
	System.out.println("Step - 2");
	sa.assertEquals("Hello", "Heello");//Though my scripts fail my script completes with soft assert
	System.out.println("Step - 3");
	System.out.println("Step - 4");
	sa.assertAll();
	System.out.println("====Test Case "+mtd.getName()+" Ended Execution===");
}
@Test
public void verifyLogoHomepageTest(Method mtd) {
	System.out.println("====Test Case ===="+mtd.getName()+"==== Started Execution===");
	System.out.println("Step - 1 ");
	System.out.println("Step - 2");
	Assert.assertTrue(false);//Problem of Hard Assert Stops Execution at this point see the console
	System.out.println("Step - 3");
	System.out.println("Step - 4");
	System.out.println("====Test Case "+mtd.getName()+" Ended Execution===");
}
}
