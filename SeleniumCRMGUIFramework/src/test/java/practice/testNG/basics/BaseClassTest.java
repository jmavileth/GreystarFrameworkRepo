package practice.testNG.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClassTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BS==Connect with DB==");
	}

	public WebDriver driver = null;
	public static WebDriver sdriver=null;

	@Parameters("BROWSER")
	@BeforeClass
	public void configBC(String browser) {//From the Parameters it comes here in browser
		System.out.println("BC===Launch the Browser===");
		String BROWSER = browser;
		if(BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(BROWSER.equals("firefox")) {
			driver = new ChromeDriver();
		}
		else if(BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BM===Login to App===");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BT");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AM===Logout to App===");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AT");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AC===Close the Browser===");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AS==Disconnect with DB==");
	}
}
