Feature: Passing multiple parameters to the step

  @dataTable
  Scenario: User searches for multiple items
    Given User is on Google search page
    Then User should be able to search for following:
    # these are pipelines
    # option + command + l -> will design for you.
      | java          |
      | selenium      |
      | cucumber bdd  |
      | QA automation |
      | wooden spoon  |
