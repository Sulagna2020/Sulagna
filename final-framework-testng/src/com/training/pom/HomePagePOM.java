package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {
	private WebDriver driver;
	
	public HomePagePOM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);			
	}

	@FindBy(xpath="//a[text()='Uniform Store']")
	private WebElement uniformStoreLink;
	
	@FindBy(xpath="//a[@title ='My account']/i")
	private WebElement MyAccount;
	
	
	public boolean verifyUniformLink() {
		return this.uniformStoreLink.isDisplayed();
		
	}
	
	public void clickMyAccount() {
		this.MyAccount.click();
	}
}
