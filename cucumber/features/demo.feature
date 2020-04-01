Feature: login to Demoweb shop site
  user shall be able to login to Demoweb shop site

  
  Scenario: successful login to Demoweb shop
    Given user launched chrome browser
	And user provides the valid url
	And user clicks on login hyperlink
	When user provides valid Email and Password
	And he clicks on Login button
	Then user shall be able to view the homepage
	And see the welcome message