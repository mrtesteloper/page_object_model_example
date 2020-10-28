package com.mrtesteloper.pom_example.test;


import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mrtesteloper.pom_example.ContactPageFactory;


public class ContactPageFactoryTest {
	static WebDriver driver;
	
	
	@Before
	public void setup() throws InterruptedException{
		driver = new ChromeDriver();
	 	driver.get("https://mrtesteloper.wordpress.com/contacto/");
	 
	}
	
	@Test
	public void test() throws InterruptedException {		
		
		// add info to text boxes
		ContactPageFactory contactpage = new ContactPageFactory(driver);
		contactpage
			.setName("Nuevo Usuario de Prueba")
			.setEmail("mrtesteloper@gmail.com")
			.setMessage("Esta es solo una prueba");
		
		// boxes should not be empty 
		assertTrue(!contactpage.getEmail().isEmpty());
		assertTrue(!contactpage.getName().isEmpty());
		assertTrue(!contactpage.getMessage().isEmpty());			
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
}
