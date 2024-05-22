package com.amazon.ecom.objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomeStorePage {//Rule 1- Create a separate Java Class
	//Rule 2- Object Creation
	
	//AutoHealing Concept Uses or
	@FindAll({@FindBy(id = "twotabsearchtextbox"), @FindBy(xpath = "//input[@placeholder='Search Amazon.in']")})
	private WebElement searchTextBox;
	//@FindBy(id = "twotabsearchtextbox")
	//private WebElement searchTextBox;
	
	//Uses And Gate means both the locators should be valid then it will consider
	@FindBys({@FindBy(id = "nav-search-submit-button"), @FindBy(xpath = "//input[@type='submit']")})
	private WebElement searchButton;
//	@FindBy(id = "nav-search-submit-button")
//	private WebElement searchButton;
//Rule 3- Object Initialization should be done in test script in constructor
	WebDriver driver;
	public HomeStorePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Rule 4- if there is any changes, change in repository#
	public WebElement getSearchTextBox() {
		return searchTextBox;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	//Business Library is required when you required muliple actions
	public void searchPhone(String phoneName) throws Throwable {
		driver.manage().window().maximize();
		getSearchTextBox().sendKeys(phoneName);
		getSearchButton().click();
		
		Thread.sleep(2000);
	}
	
}
