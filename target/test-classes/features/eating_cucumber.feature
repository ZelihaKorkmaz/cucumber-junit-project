Feature: Eating too many cucumbers may not be good for you
  user story: Eating too much of anything many not be good for you

  Scenario: Eating a few is no problem
    Given John is hungary
    When he eats some cucumbers
    Then he will be full
