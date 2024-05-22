package practice.pom.repository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPhoneWithoutPOMTest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement element1 = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement element2 = driver.findElement(By.id("nav-search-submit-button"));
		element1.sendKeys("iPhone");
		element2.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.close();
	}

}
