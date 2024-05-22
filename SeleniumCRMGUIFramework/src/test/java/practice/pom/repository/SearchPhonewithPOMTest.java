package practice.pom.repository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.ecom.objectRepositoryUtility.HomeStorePage;
import com.amazon.ecom.objectRepositoryUtility.PhoneSearchPage;
import com.greystar.crm.generic.fileUtility.FileUtility;
import com.greystar.crm.generic.webDriverUtility.WebDriverUtility;

public class SearchPhonewithPOMTest {
	WebDriver driver = null;

	@Test
	public void SearchPhoneTest() throws Throwable {
		FileUtility fLib= new FileUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		//HomeStorePage homeStorePage = PageFactory.initElements(driver, HomeStorePage.class);
		HomeStorePage homeStorePage = new HomeStorePage(driver);
		String PRODUCT=fLib.getDataFromPropertiesFile("productName");
		homeStorePage.searchPhone(PRODUCT);
		PhoneSearchPage phoneSearchPage = new PhoneSearchPage(driver);
		//phoneSearchPage.sortToLowPrice();
		Thread.sleep(3000);
		wLib.scrollTillMidOfPage(driver);
		
		WebElement priceOfFirstLowProduct = driver.findElement(By.xpath("(//span[contains(text(),'"+PRODUCT+"')]/../../../../div[3]/div/div/div/div[1]/div/a/span/span[1])[1]"));
		String sprice = priceOfFirstLowProduct.getText();
		System.out.println(sprice+"Hello");
		driver.close();
	}
}
