Feature: Checking the weather
  So that we can know what the weather forecast is
  As an internet user
  I want to enter my postcode and see the weather displayed

  Scenario: Get answers based on played numbers
    Given I am logged on the bbc weather portal
    When I enter my postcode
    Then I see the weather for Preston