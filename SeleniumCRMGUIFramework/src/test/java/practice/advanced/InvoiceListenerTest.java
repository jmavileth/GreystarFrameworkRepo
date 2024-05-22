package practice.advanced;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.greystar.crm.basetest.BaseClassTest;

@Listeners(com.greystar.crm.listenerUtility.ListenerImplentationClass.class)
public class InvoiceListenerTest extends BaseClassTest{
	@Test
	public void testRunTest() {
		Assert.assertTrue(false);
	}

}
