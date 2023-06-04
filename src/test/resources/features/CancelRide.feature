Feature: Cancel Ride

  Background:
    Given User is in "Indiranagar"
    And User is logged in

  Scenario: Verify user is able to cancel the ride before driver accepts the task
    When User search for destination "Koramangala"
    And User clicks on Book Auto
    And User confirm the Location
    And User cancels the ride
    Then User is on book auto page


  Scenario: Verify user is able to cancel the ride after driver accepts the task
    When User search for destination "Koramangala"
    And User clicks on Book Auto
    And User confirm the Location
    And Driver accepts the ride
    And User cancels the ride
    Then User is on book auto page

  Scenario: Verify user is not able to cancel the task after sharing the OTP with driver
    When User search for destination "Koramangala"
    And User clicks on Book Auto
    And User confirm the Location
    And Driver accepts the ride
    When User shares the OTP
    Then User is unable to cancel the ongoing task

