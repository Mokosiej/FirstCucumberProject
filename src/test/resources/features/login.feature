Feature: Login

  #

  @positive
  Scenario: Login with correct data
    Given User launches Chrome Browser
    When User opens ilcarro Home Page
    And User clicks on Login link
    And User enters correct data
    And User clicks on Yalla button
    Then User verifies Success message is displayed
    And User closes browser

    @wrongPassword
    Scenario Outline: Login with correct email and wrong password
      Given User launches Chrome Browser
      When User opens ilcarro Home Page
      And User clicks on Login link
      And User enters correct email and wrong password
      |email|password|
      |<email>|<password>|
      And User clicks on Yalla button
      Then User verifies Error is displayed
      And User closes browser
      Examples:
        |email|password|
      |   bobget@gh.com  | 0123!@#QwAs|
      |   bobget@gh.com  | 123!@#Qwas |
      |   bobget@gh.com  | 123!@#QwAS |