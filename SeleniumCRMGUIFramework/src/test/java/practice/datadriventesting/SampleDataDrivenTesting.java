package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleDataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = null;
		FileInputStream fin = new FileInputStream(
				"D:\\TestYantraTraining\\SeleniumCRMGUIFramework\\src\\test\\java\\practice\\datadriventesting\\commondata.properties");

		Properties pObj = new Properties();
		pObj.load(fin);

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		String BROWSER = pObj.getProperty("browser");
		String LOCATION = pObj.getProperty("searchBarLocation");
		String URL = pObj.getProperty("url");

		System.out.println(BROWSER);
		if (BROWSER.equals("chrome")) {

			driver = new ChromeDriver();

		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		}

		else {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.cssSelector("#predictive-search-input")).sendKeys(LOCATION);

		driver.findElement(By.cssSelector("button[for='Location']")).click();

		Thread.sleep(10000);
		driver.quit();

	}

}
