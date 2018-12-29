@Smoke
Feature: Scenario to demonstrate actual spring service call from bdd test

  Scenario: Verify status after service call
    Given some service exists
      And setup clean & fresh test data
    When the client calls service
    Then verify expected result
    Then cleanup demo test data

