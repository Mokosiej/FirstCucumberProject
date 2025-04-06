Feature: Add car

  @rent
  Scenario: Adding a car with positive data
    Given User launches Chrome Browser
    When User opens ilcarro Home Page
    And User clicks on Login link
    And User enters correct data
    And User clicks on Yalla button
    And User clicks on OK button
    And User clicks on Let the car work link
    And User enters cars valid data
    And Uswr click on Submit button
    Then User verifies massage car was added


    # "Jerusalem, Israel"
  # |Make  |Model  |Year|Fuel  |Seats|CarClass|Registration Number|Price|
  # |Toyota|Corolla|2020|Petrol|  5  |  C     |      ABC12345     |500   |
  # "bobget@gh.com", "123!@#QwAs"