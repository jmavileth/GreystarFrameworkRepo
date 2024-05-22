package practice.testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class CreateContactRetryListenerTest {
	
	@Test(retryAnalyzer = com.greystar.crm.listenerUtility.RetryListenerImpClass.class)
	public void activateSim() {
		System.out.println("Step 1");
		System.out.println("Step 2");
		Assert.assertTrue(false);
		System.out.println("Step 3");
		System.out.println("Step 4");
	}

}
