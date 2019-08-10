@so
Feature: Wikipedia search feature

  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on wikipedia homepage
    When User types "<searchKey>" in the wiki search box
    And User clicks search button finally
    Then User sees "<title>" is in the wiki title

    Examples: Test data for search functionality
      | searchKey    | title        |
      | Steve Jobs   | Steve Jobs   |
      | Ricky Martin | Ricky Martin |
      | Lionel Messi | Lionel Messi |
      | Lady Gaga    | Lady Gaga    |
      | Vladimir Putin | Vladimir Putin |