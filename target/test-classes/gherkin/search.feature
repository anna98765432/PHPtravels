Feature: Search for hotels

  Scenario: Should find hotel in London
    Given System display start page
    When User search for hotel in "London" with checkin date as "24/07/2018" and checkout date as "28/07/2018"
    Then System display Hotel in London