Feature: Book Ride

  Background:
    Given User is in "Indiranagar"
    And User is logged in

  Scenario: Verify user is able to book the ride
    When User search for destination "Koramangala"
    And User clicks on Book Auto
    And User confirm the Location
    Then User sees following fields on ride confirmed page
      | Your ride is confirmed                 |
      | Driver Name                            |
      | Vehicle Details                        |
      | Driver Rating with orange star         |
      | Driver vaccination status              |
      | Auto icon                              |
      | Call option                            |
      | Message your driver edit field         |
      | "Your ride is on the way" notification |

