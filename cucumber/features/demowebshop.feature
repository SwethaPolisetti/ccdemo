Feature: login demoweb shop
  I want to use this template for my feature file

  Scenario Outline: Successful login to demoweb shop
    Given user launched the home page of demowebshop site
    And user launched the home page of demowebshop site
    When user provides valid email <email>
    When user provides the valid password <password>
    And user clicks on login buttton
    Then user shall be able to view the homepage

    Examples: 
      | email                | password   |
      | karthik456@gmail.com | karthik456 |