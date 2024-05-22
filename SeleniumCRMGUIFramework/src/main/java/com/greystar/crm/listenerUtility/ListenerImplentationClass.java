package com.greystar.crm.listenerUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.greystar.crm.basetest.BaseClassTest;
import com.greystar.crm.generic.fileUtility.CaptureFileStamp;
import com.greystar.crm.generic.webDriverUtility.JavaUtility;

public class ListenerImplentationClass implements ITestListener, ISuiteListener {
	
	 public void onStart(ISuite suite) {
		   System.out.println("Report Configuration");
		  }

		  
		  public void onFinish(ISuite suite) {
			  System.out.println("Report Backup");
		  }
		  public void onTestStart(ITestResult result) {
		    System.out.println("=======This Test Started"+result.getMethod().getMethodName()+"======");
		  }

		
		  public void onTestSuccess(ITestResult result) {
			   System.out.println("=======This Test "+result.getMethod().getMethodName()+" Successfully Ran === End======");
		  }

		 //whenever any script gets fail in runtime this method is going to get executed
		  public void onTestFailure(ITestResult result) {
		    String testName = result.getMethod().getMethodName();
		    @SuppressWarnings("deprecation")
			EventFiringWebDriver edriver= new EventFiringWebDriver(BaseClassTest.sdriver);
			File srcFile=edriver.getScreenshotAs(OutputType.FILE);
			try {
				
				FileUtils.copyFile(srcFile, new File("./screenshots/"+testName+ new JavaUtility().getTimestamp()+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }

		  public void onTestSkipped(ITestResult result) {
		    // not implemented
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
