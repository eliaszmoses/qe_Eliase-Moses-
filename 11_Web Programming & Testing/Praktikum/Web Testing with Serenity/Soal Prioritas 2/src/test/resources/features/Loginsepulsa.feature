Feature: Sepulsa Login

  @loginsepulsa
  Scenario: Positive Case - User can login successfully
    Given User is on Sepulsa homepage
    When User clicks on Login button
    And User enters valid email and password
    And User clicks on Login button
    Then User should be redirected to Sepulsa dashboard

  Scenario: Negative Case - User cannot login with invalid credentials
    Given User is on Sepulsa homepage
    When User clicks on Login button
    And User enters invalid email and password
    And User clicks on Login button
    Then User should see an error message "Invalid email or password"
