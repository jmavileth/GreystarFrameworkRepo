package com.amazon.ecom.objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneSearchPage {
	@FindBy(xpath = "//span[text()='Featured']")
	private WebElement featuredDropdown;

	@FindBy(id = "s-result-sort-select_1")
	private WebElement priceLowToHighSelect;

	WebDriver driver;
	public PhoneSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFeaturedDropdown() {
		return featuredDropdown;
	}

	public WebElement getPriceLowToHighSelect() {
		return priceLowToHighSelect;
	}

	public void sortToLowPrice() {
		getFeaturedDropdown().click();
		getPriceLowToHighSelect().click();
	}

}
