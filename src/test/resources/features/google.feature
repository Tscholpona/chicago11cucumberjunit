  @back
  Feature:  Google title verification
 Background: Login to Google
 When User sees google search page
  @googleTitle
  Scenario: Google title verification

    Then User searches for "crayons"
    Then User sees crayons inside of title

    @newVersion
   Scenario: Google title verification with preferred data
     And User searches for a word "table"
     Then User should see a new word "table" inside of the title
  @testing
  Scenario: Google title test
    Given User tests with words "kitten" "jeans" "tv"
    Then User checks numbers 11 and 33


