Feature: Complete Ride

  Background:
    Given User is in "Indiranagar"
    And User is logged in

  Scenario:
    When User search for destination "Koramangala"
    And User clicks on Book Auto
    And User confirm the Location
    And Driver accepts the ride
    Then User is on Your ride is confirmed page
    And driver initiates the journey
    Then driver reaches to the pickup location
    When User shares the OTP
    And User is on Your ride has been verified page
    When driver completed the journey
    Then User is on Home page


