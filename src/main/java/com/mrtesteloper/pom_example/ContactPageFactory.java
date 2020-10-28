package com.mrtesteloper.pom_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPageFactory {
	
	WebDriver driver; 
	
	@FindBy(id = "g332-nombre")
	WebElement name; 
	
	@FindBy(id = "g332-correoelectrnico")
	WebElement email; 
	
	@FindBy(id = "contact-form-comment-g332-mensaje")
	WebElement message; 
	
	public ContactPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ContactPageFactory setName(String name) {
		this.name.sendKeys(name);
		return this;
	}
	
	public ContactPageFactory setEmail(String email) {
		this.email.sendKeys(email);
		return this;
	}
	
	public ContactPageFactory setMessage(String message) {
		this.message.sendKeys(message);
		return this;
	}
	
	public String getEmail() {
		return email.getAttribute("value");
	}
	
	public String getName() {
		return message.getAttribute("value");
	}
	
	public String getMessage() {
		return message.getAttribute("value");
	}
}