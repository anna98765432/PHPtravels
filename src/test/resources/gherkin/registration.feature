Feature: User Register

  Scenario: User should Login
    Given System display registration page
    When User is filling up registration form with "name", "last name", "mobile number", "email", "password"
  and "confirmpassword" and signs up
    Then System display loogged in page