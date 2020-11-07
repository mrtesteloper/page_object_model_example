package com.mrtesteloper.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  
@CucumberOptions(		
		plugin = {"pretty", "html:Reporte/Reporte de prueba.html"},
		glue = {"com.mrtesteloper.stepdefinitions"},		
		features = "Features",
		tags = "@pruebaEjemplo"
		) 
public class CucumberRunner {
	
}
 