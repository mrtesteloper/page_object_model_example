package com.mrtesteloper.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage{
		
	private final String URL = "https://mrtesteloper.wordpress.com/contacto";
	private By nameID = By.id("g332-nombre");
	private By emailID = By.id("g332-correoelectrnico");
	private By messageID = By.id("contact-form-comment-g332-mensaje");
	
	
	public ContactPage(WebDriver driver) {
		super(driver);
	}
	
	public ContactPage setName(String name) {
		driver.findElement(nameID).sendKeys(name);
		return this;
	}
	
	public ContactPage setEmail(String email) {
		driver.findElement(emailID).sendKeys(email);
		return this;
	}
	
	public ContactPage setMessage(String message) {
		driver.findElement(messageID).sendKeys(message);
		return this;
	}
	
	public String getEmail() {
		return driver.findElement(emailID).getAttribute("value");
	}
	
	public String getName() {
		return driver.findElement(nameID).getAttribute("value");
	}
	
	public String getMessage() {
		return driver.findElement(messageID).getAttribute("value");
	}		
	
	public void load() {
		super.load(URL);
	}
	
}
