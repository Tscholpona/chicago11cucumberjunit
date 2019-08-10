@wikipediaBackground
Feature: Wikipedia search feature

  Background: Wikipedia Search Functionality Title Verification
    Given User is on wikipedia homepage
    When User types "Steve Jobs" in the wiki search box
    And User clicks search button finally

    Scenario: Wikipedia search functionality Title Verification
    Then User sees "Steve Jobs" is in the wiki title



  Scenario: Wikipedia Search Functionality Header Verification
    Then User sees "Steve Jobs" is in the main header



  Scenario: Wikipedia Search Functionality Image Header Verification
    Then User sees "Steve Jobs" is in the image header

