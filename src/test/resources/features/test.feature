Feature: Amazon verification
  #Comments go using this sign
  @amazon
  Scenario: Amazon title verification
    When User is on Amazon application
    Then User should see Amazon in title
    And User searches for a bag

    Scenario: Amazon search verification
      When User is on Amazon application

