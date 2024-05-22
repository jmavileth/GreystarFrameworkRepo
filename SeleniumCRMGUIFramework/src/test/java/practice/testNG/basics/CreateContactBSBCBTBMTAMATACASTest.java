package practice.testNG.basics;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.greystar.crm.basetest.NewBaseClassTest;
import com.greystar.crm.generic.webDriverUtility.UtilityClassObject;

public class CreateContactBSBCBTBMTAMATACASTest extends NewBaseClassTest {

	@Test(groups = {"SmokeTest", "RegressionTest"})
	public void CreateContact() {
		UtilityClassObject.getTest().log(Status.INFO, "Create Contact Test Execution");
		System.out.println("Create Contact Test Execution");
	}
	@Test(groups = "RegressionTest")
	public void CreateOrg() {
		UtilityClassObject.getTest().log(Status.INFO, "Create org Test Execution");
	
		Assert.assertTrue(false);
		System.out.println("Create org Test Execution");
	}
	@Test(groups = "RegressionTest")
	public void CreateOrgwithIndustry() {
		UtilityClassObject.getTest().log(Status.INFO, "Create org with industry Test Execution");
		System.out.println("Create org with industry Test Execution");
	}
	}
