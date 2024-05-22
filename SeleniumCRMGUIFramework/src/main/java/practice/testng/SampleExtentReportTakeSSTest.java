package practice.testng;

import java.lang.reflect.Method;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.greystar.crm.generic.webDriverUtility.JavaUtility;

public class SampleExtentReportTakeSSTest {
	ExtentSparkReporter spark;
	ExtentReports report;

	@BeforeSuite
	public void configBS() {
		// Config Extent Report in BeforeSuite
		// Config in BeforeSuite
		JavaUtility ju = new JavaUtility();
		// Spark Report Config
		spark = new ExtentSparkReporter("./AdvancedReport/report_" + ju.getTimestamp() + ".html");
		spark.config().setDocumentTitle("Greystar CRM Testing Suite Results");
		spark.config().setReportName("Greystar CRM Report");
		spark.config().setTheme(Theme.STANDARD);

		// Add Env Report and Create Test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("BROWSER", "chrome-125");
		
		

	}

	@Test
	public void createContactTest(Method md) {

		ExtentTest test = report.createTest("createContactTest");
		test.log(Status.INFO, "Login To App");
		test.log(Status.INFO, "Navigate to contact Page");
		test.log(Status.INFO, "Create Contact");
		if ("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "Contact Created");
		} else {
			test.log(Status.FAIL, "Contact is not created");
		}

	}

	@Test
	public void modifyContactTest() {

		ExtentTest test = report.createTest("modifyContactTest");
		test.log(Status.INFO, "Login To App");
		test.log(Status.INFO, "Navigate to contact Page");
		test.log(Status.INFO, "Update Contact");
		if ("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "Contact Created");
		} else {
			test.log(Status.FAIL, "Contact is not created");
		}

	}

	@Test
	public void deleteContactTest() {

		ExtentTest test = report.createTest("deleteContactTest");
		test.log(Status.INFO, "Login To App");
		test.log(Status.INFO, "Navigate to contact Page");
		test.log(Status.INFO, "Delete Contact");
		if ("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "Contact Created");
		} else {
			test.log(Status.FAIL, "Contact is not created");
		}

	}

	@AfterSuite
	public void configAS() {
		// Flush in after suite
		report.flush();
	}
}
