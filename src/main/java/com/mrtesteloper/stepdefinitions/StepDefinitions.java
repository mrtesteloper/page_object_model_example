package com.mrtesteloper.stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mrtesteloper.pageobjects.ContactPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;



public class StepDefinitions {
	private WebDriver driver; 
	private ContactPageFactory contactPage;

	
public void openDriver() {
	this.driver = new ChromeDriver();		
}
	
@Dado("que estoy en la pagina de contacto")
@Given("I am on the contact page")
public void i_am_on_the_contact_page() {
	openDriver();
	contactPage = new ContactPageFactory(driver);
	contactPage.load();
}

@Cuando("lleno el campo de nombre con {string}")
@When("I fill the name field with {string}")
public void i_fill_the_name_field_with(String name) {
    contactPage.setName(name);
}

@Cuando("lleno el campo de correo electronico con {string}")
@When("I fill the email field with {string}")
public void i_fill_the_email_field_with(String email) {
   contactPage.setEmail(email);
}

@Cuando("lleno el campo de mensaje con {string}")
@When("I fill the message {string}")
public void i_fill_the_message(String message) {
	contactPage.setMessage(message);
}

@Entonces("el campo de nombre no debe estar vacio")
@Then("the field name should not be empty")
public void the_field_name_should_not_be_empty() {
	assertTrue(!contactPage.getName().isEmpty());
}

@Entonces("el campo de correo electronico no debe estar vacio")
@Then("the field email should not be empty")
public void the_field_email_should_not_be_empty() {
	assertTrue(!contactPage.getEmail().isEmpty());
}

@Entonces("el campo de mensaje no debe estar vacio")
@Then("the field message should not be empty")
public void the_field_message_should_not_be_empty() {
	assertTrue(!contactPage.getMessage().isEmpty());
}


}
