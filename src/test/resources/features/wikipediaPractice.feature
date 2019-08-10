@wikiPractice1
Feature: Wikipedia search functionality

  Background: Wikipedia Search functionality title verification
    Given I am in the website page
    When I type "Muhammed Ali" in the search page
    And I click on search button

  Scenario: Wikipedia search functionality header verification
    Then I see "Muhammed Ali" in the main header;

  Scenario: Wikipedia search functionality image header verification
    Then I see "Muhammed Ali" in the image header


