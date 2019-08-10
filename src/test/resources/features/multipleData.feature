Feature: Testing with multiple data
  @listOfItems
  Scenario: Testing data
    Given User goes to amazon
    And User verifies following search departments
    |Alexa Skills|
    |Computers   |
    |Digital Music|
    |Courses      |
    |Baby         |
    Then User closes the amazon
