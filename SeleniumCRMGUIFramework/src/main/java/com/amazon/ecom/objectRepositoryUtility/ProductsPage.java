package com.amazon.ecom.objectRepositoryUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
@FindBy(xpath = "//span[text()='Featured']")
private WebElement featuredDropdown;

}
