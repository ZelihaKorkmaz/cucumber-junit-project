Feature: SmartBear order process
  User Story:  As a user, I should be able to place order

  @smartBear @orderProcess
  Scenario: As a user, I should be able to see myself on the list after placing order.
    Given User is logged into SmartBear Tester account and on Order page
      | Username | Tester |
      | Password | test   |
    When User fills out the form as followed:
    And User selects "FamilyAlbum" from product dropdown
    Then User enters 4 to quantity
    And User enters "John Wick" to costumer name
    Then User enters "Kinzie Ave" to street
    And User enters "Chicago" to city
    Then User enters "IL" to state
    And User enters 60056
    Then User selects "Visa" as card type
    And User enters "1111222233334444" to card number
    Then User enters "12/22" to expiration date
    When User clicks process button
    Then User verifies "John Wick" is in the list
