Feature: Employee Apprisal Process
  I want to use this template for my feature file

  @tag2
  Scenario Outline: employee appraisal
    Given the employee name is "<empname>"
    When he gets rating as <rating>
    Then he shall recieve the hike percent as <hikepercent>

    Examples: 
      | empname | rating | hikepercent |
      | swetha  |      9 |          80 |
      | sumu    |      6 |          90 |
