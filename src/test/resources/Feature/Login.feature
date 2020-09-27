@Login
Feature: Login with existing credentials and send a mail

Background:
Given I am able to launch the application
	@LoginOnly
    Scenario Outline: Login successfully
    When I enter username as "<username>"
    And I enter password as "<password>"
    And I click on Login button
    Then I should successfully login and view course catalog

Examples:
|username|password	 |
|jaya123 |password|


	@Compose
	Scenario Outline: Compose and Send a mail successfully
		When I enter username as "<username>"
    And I enter password as "<password>"
    And I click on Login button
    And I should successfully login and view course catalog
		And I click on compose link
    And I enter Send address as "<SendTo>"
    And I enter Subject as "<Subject>"
    And I enter message body as "<Message>"
    And I click on Send message button
    Then I should see a confirmation for message sent

Examples:
|username|password|SendTo|Subject	 |Message|
|jaya123|password|Jayasree007|Sample mail|This is a test mail to see if it is working|


