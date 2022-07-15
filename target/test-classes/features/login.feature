@Regression
Feature: Library app login feature
  User Story:As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin

  #@Before - setting up the driver
  #Background - executing the repetitive first step of the scenarios
  #@After - terminating the driver, closing tabs etc.

  #this keyword is like @Before in testNG. Background is running before each scenario
  Background:  For each scenario user is on library login page
    Given user is on the Library login page

  @librarian @employee
  Scenario: Login as librarian
  #  Given user is on the Library login page
    When user enter librarian username
    And user enters librarian password
    Then user should see dashboard

  @student
  Scenario: Login as student
 #   Given user is on the Library login page
    When user enters student username
    And user enters student password
    Then user should see dashboard


  Scenario: Login as admin
 #   Given user is on the Library login page
    When user enters admin username
    And user enters admin password
    Then user should see dashboard