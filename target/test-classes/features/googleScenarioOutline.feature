Feature: Data Driven tesing using Scenario Outline

  @google_scenario_outline
  Scenario Outline: Google capital cities search
    Given User is on Google search page
    When User searches for "<country>" capital
    Then User should see "<capital>" in the result

    Examples:  #Examples represent test data. you have to write this when you are using scenario outline.
      | country    | capital          |
      | AZERBAIJAN | Baku             |
      | TAJIKISTAN | Dushanbe         |
      | CROATIA    | Zagreb           |
      | BOSNIA     | Sarajevo         |
      | TURKEY     | Ankara           |
      | USA        | Washington, D.C. |



