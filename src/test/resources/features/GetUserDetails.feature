Feature: Validation of get method

  @GetUserDetails
  Scenario: Send a valid Request to get user details

    Given I send a request to the URL to get user details
    Then Verify response status code as 200



