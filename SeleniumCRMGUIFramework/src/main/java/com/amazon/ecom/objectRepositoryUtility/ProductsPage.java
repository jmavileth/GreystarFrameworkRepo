package com.amazon.ecom.objectRepositoryUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
@FindBy(xpath = "//span[text()='Featured']")
private WebElement featuredDropdown;


@FindBy(id = "s-result-sort-select_2")
private WebElement priceHighToLowSelect;

@FindBy(id = "s-result-sort-select_1")
private WebElement priceLowToHighSelect;



@FindBy(id = "s-result-sort-select_1")
private WebElement locationSelect;


public WebElement getFeaturedDropdown() {
	return featuredDropdown;
}

public WebElement getPriceLowToHighSelect() {
	return priceLowToHighSelect;
}
public WebElement getPriceHighToLowSelect() {
	return priceHighToLowSelect;
}
public WebElement getLocationSelect() {
	return locationSelect;
}

}
