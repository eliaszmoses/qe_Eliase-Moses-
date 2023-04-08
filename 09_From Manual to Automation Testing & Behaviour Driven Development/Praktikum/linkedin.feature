@LinkedIn
Feature: LinkedIn Home

  @Login @NormalNegative @LoginLinkedInFailed
  Scenario: User cannot login with incorrect username and incorrect password
    Given user is on linkedin landing page
    And user input incorrect username "USERNAME"
    And user input incorrect password "PASSWORD"
    And user click login
    Then user cannot login and still on login page