package practice.testNG.basics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class SampleTestForScreenshot {
	@Test
	public void name() throws Throwable   {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		@SuppressWarnings("deprecation")
		EventFiringWebDriver edriver= new EventFiringWebDriver(driver);
		File srcFile=edriver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./screenshots/test.png"));
		
	}

}
