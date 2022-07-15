
Feature: Google Search Functionality Title Verification
  User Story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information


  Background:
    Given User is on Google search page
    #wip means working in progress


  Scenario: Search functionality result title verification
 # Given User is on Google search page
  When  User types apple in the google search box and clicks enter
  Then  User sees apple – Google Search is in the google title

@googleSearch
  Scenario: Search functionality result title verification
  # Given User is on Google search page
    When  User types "apple" in the google search box and clicks enter
    Then  User sees "apple - Google Search" is in the google title


