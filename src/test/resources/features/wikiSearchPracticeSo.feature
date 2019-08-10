@wikiPraktika
Feature: Wikipedia search feature

  Scenario Outline: Wikipedia search functionality title verification
    Given I am in the website page
    When I type "<searchKey>" in the search page
    And I click on search button
    Then I see "<title>" in the main header;
    Examples: List of names from search functionality
      | searchKey       | title           |
      | Muhammed Ali    | Muhammed Ali    |
      | Donald Trump    | Donald Trump    |
      | Philip Kirkorov | Philip Kirkorov |
      | Alla Pugacheva  | Alla Pugacheva  |
      | Lady Gaga       | Lady Gaga       |

