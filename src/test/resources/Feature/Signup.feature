@Register
Feature: Register the user
 I want to use this to signup and register to elearning
 

Background:
Given I am able to launch the elearning application

    
  Scenario Outline: Register successfully
    When I click on SignUp link
    And I enter the firstname as "<firstname>"
    And I enter the lastname as "<lastname>"
    And I enter the email as "<email>"
    And I enter the username as "<user>"
    And I enter the password as "<pwd>"
    And I confirmpassword as "<confirmpwd>"
    And I click on the Register button
    Then I should see a confirmation message for registration success
    
Examples:
|firstname	|lastname	|email								 |user	 |pwd				 |confirmpwd |
|Jaya2				|Sree2			|jayasree2.jas@gmail.com|jaya12345|password1234|password1234|
	


