Feature: Etsy Title Verification
  User Story: As a user, I should see the title properly.

  Background:
    Given User is on the Etsy page


#TC #51: Etsy Title Verification
  @etsyTC1 @task51 @123
    Scenario: Search for item and see new title contains this item
 #   Given User is on the Etsy page
    And User sees title is as expected



#TC #52: Etsy Search Functionality Title Verification (without parameterization)
  @etsyTC2 @task52 @123
  Scenario: Search for item and see new title contains this item
#    Given User is on the Etsy page
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title



#TC #53: Etsy Search Functionality Title Verification (with parameterization)
  @etsyTC3 @task53 @123
  Scenario: Search for item and see new title contains this item
#    Given User is on the Etsy page
    When User types "cup" in the search box
    And User clicks search button
    Then User sees "Cup" is in the title






