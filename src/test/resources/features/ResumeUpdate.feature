Feature: Naukri Resume Update

  Scenario: User logs in, updates resume, and logs out
    Given User is on the Naukri login page
    When User enters valid credentials
    And User clicks on the login button
    Given User is on profile page
    When User uploads a new resume
    When User clicks on logout button
