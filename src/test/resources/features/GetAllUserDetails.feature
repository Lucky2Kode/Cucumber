Feature: Validation of get method

  @GetUserDetails
  Scenario: Send a Request to get all User details

    Given I send a request to the URL to get all user details
    Then Verify response status code of 200



