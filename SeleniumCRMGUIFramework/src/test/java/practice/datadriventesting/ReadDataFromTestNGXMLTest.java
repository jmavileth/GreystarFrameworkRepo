package practice.datadriventesting;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadDataFromTestNGXMLTest {

	@Test
	public void sampleTest(XmlTest test) {// XML feature given by testbg
		System.out.println("Execute Test");
		System.out.println(test.getParameter("browser"));
	}

}
