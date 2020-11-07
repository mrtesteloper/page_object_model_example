@exampleFeature
Feature: Test Example
  This test is an example
  
@exampleTest1
Scenario: Fill down contact info
	Given I am on the contact page
  When I fill the name field with "Nombre de usuario"
		And I fill the email field with "mr.testeloper@gmail.com"
		And I fill the message "Esta es solo una prueba"
	Then the field name should not be empty
		And the field email should not be empty
		And the field message should not be empty

@exampleTest2
Scenario Outline: Fill down contact info
	Given I am on the contact page
	When I fill the name field with "<name>"
  	And I fill the email field with "<email>"
  	And I fill the message "<message>"
  Then the field name should not be empty
  	And the field email should not be empty
  	And the field message should not be empty
	Examples: 
  | name               | email                   | message                 |
  | Nombre de usuario1 | mr.testeloper@gmail.com | Esto es solo una prueba |
  | Nombre de usuario2 | mr.testeloper@gmail.com | Esto es solo una prueba |  