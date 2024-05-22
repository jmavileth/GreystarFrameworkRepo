package practice.pom.repository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SampleClassWithPomTest {
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchTextbox;
	@FindBy(id = "nav-search-submit-button")
	WebElement searchButton;

	@Test
	public void sampleTest() throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		SampleClassWithPomTest latestElements = PageFactory.initElements(driver, SampleClassWithPomTest.class);
//Do not forget to initialise the elements with Page Factory and store the latest elements
		latestElements.searchTextbox.sendKeys("iPhone");
		driver.navigate().refresh();
		latestElements.searchTextbox.sendKeys("iPhone");
		latestElements.searchButton.click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
