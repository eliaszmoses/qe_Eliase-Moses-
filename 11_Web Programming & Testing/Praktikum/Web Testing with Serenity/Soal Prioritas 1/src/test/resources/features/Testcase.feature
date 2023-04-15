Feature: Login to sauce demo

  @loginsaucedemo
  Scenario: Login with correct username and password
    Given User is on the sauce demo login page
    When User enters valid username and password
    And User press login button
    Then User is on the home page

  Scenario: Login with correct username and incorrect password
    Given User is on the sauce demo login page
    When User enters valid username and incorrect password
    And User press login button
    Then User should see an error message"

  Scenario: Login with incorrect username and correct password
    Given User is on the sauce demo login page
    When User enters incorrect username and valid password
    And User press login button
    Then User should see an error message"