package practice.testng;

import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.greystar.crm.generic.webDriverUtility.JavaUtility;

public class SampleTakeScreenshotReportTest {
	@Test
	public void createContactTest(Method md) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		
		TakesScreenshot edriver= (TakesScreenshot) driver;
		String filePath = edriver.getScreenshotAs(OutputType.BASE64);
		JavaUtility ju = new JavaUtility();
		// Spark Report Config
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvancedReport/report_" + ju.getTimestamp() + ".html");
		spark.config().setDocumentTitle("Greystar CRM Testing Suite Results");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.STANDARD);

		// Add Env Report and Create Test
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-10");
		report.setSystemInfo("BROWSER", "chrome-125");
		ExtentTest test = report.createTest(md.getName());

		//Config in BeforeSuite
		
		test.log(Status.INFO,"Login To App");
		test.log(Status.INFO,"Navigate to contact Page");
		test.log(Status.INFO,"Create Contact");
		if ("HDFC".equals("HFDC")) {
			test.log(Status.PASS,"Contact Created");
		} else {
			test.log(Status.FAIL,"Contact is not created");
			test.addScreenCaptureFromBase64String(filePath,"ErrorFile");
		}
		driver.close();
		//Flush in after suite
		report.flush();
	}
}
