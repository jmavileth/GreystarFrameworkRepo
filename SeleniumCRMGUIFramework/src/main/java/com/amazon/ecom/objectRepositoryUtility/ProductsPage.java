package com.amazon.ecom.objectRepositoryUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
@FindBy(xpath = "//span[text()='Featured']")
private WebElement featuredDropdown;

@FindBy(id = "s-result-sort-select_1")
private WebElement priceLowToHighSelect;

public WebElement getFeaturedDropdown() {
	return featuredDropdown;
}

public WebElement getPriceLowToHighSelect() {
	return priceLowToHighSelect;
}



}
