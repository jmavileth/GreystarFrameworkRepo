package com.greystar.crm.listenerUtility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.greystar.crm.basetest.NewBaseClassTest;
import com.greystar.crm.generic.webDriverUtility.JavaUtility;
import com.greystar.crm.generic.webDriverUtility.UtilityClassObject;

public class ListenerImplentationNewExtentReportClass implements ITestListener, ISuiteListener {

	ExtentTest test;
	public ExtentReports report;

	public void onStart(ISuite suite) {// similar to before suite implementation
		System.out.println("Report Configuration");

		JavaUtility ju = new JavaUtility();
		// Spark Report Config
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvancedReport/report_" + ju.getTimestamp() + ".html");
		spark.config().setDocumentTitle("Greystar CRM Testing Suite Results");
		spark.config().setReportName("Greystar CRM Report");
		spark.config().setTheme(Theme.DARK);

		// Add Env Report and Create Test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("BROWSER", "chrome-125");
	}

	public void onFinish(ISuite suite) {
		System.out.println("Report Backup");
		report.flush();
	}

	public void onTestStart(ITestResult result) {
		System.out.println("=======This Test Started" + result.getMethod().getMethodName() + "======");
		test = report.createTest(result.getMethod().getMethodName());
		UtilityClassObject.setTest(test);
		test.log(Status.INFO, result.getMethod().getMethodName() + "==> STARTED<====");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("=======This Test " + result.getMethod().getMethodName() + " Successfully Ran === End======");
		test.log(Status.PASS, result.getMethod().getMethodName() + "==> COMPLETED<====");
	}

	// whenever any script gets fail in runtime this method is going to get executed
	public void onTestFailure(ITestResult result) {
		String testName = result.getMethod().getMethodName();

		TakesScreenshot edriver = (TakesScreenshot) NewBaseClassTest.sdriver;
		String filePath = edriver.getScreenshotAs(OutputType.BASE64);
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		test.addScreenCaptureFromBase64String(filePath, testName + "_" + time);
		test.log(Status.FAIL, result.getMethod().getMethodName() + "==> FAILED<====");


	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName() + "==> SKIPPED<====");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		// not implemented
	}

	public void onFinish(ITestContext context) {
		// not implemented
	}

}
