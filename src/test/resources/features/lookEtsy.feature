Feature: Etsy search functionality
  @newEtsy
  Scenario: Etsy title verification using search functionality
    Given User is on Etsy website page
    When User types "Long Dress" in search box
    And User clicks on the search button
    Then User sees "Long Dress" in the title
