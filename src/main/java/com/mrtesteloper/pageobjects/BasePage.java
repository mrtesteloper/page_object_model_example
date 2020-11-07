package com.mrtesteloper.pageobjects;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	WebDriver driver; 
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void load(String url) {
		driver.get(url);
	}
	
	public void close() {
		driver.close();
	}
}

