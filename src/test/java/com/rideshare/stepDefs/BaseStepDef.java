package com.rideshare.stepDefs;

import com.rideshare.screens.BasePage;
import com.rideshare.screens.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BaseStepDef {

    @Given("User is in {string}")
    public void userIsIn(String location) {
        new BasePage().setLocation();
    }

    @Given("User is logged in")
    public void userIsLoggedIn() {
        new LoginPage().userIsLoggedIn();
    }


    @Given("Driver accepts the ride")
    public void driverAcceptTheRide() {
        //API call
    }


    @When("User shares the OTP")
    public void userSharesTheOTP() {
        //API call
    }

    @When("User is unable to cancel the ongoing task")
    public void userUnableToCancelTheTask() {
        //Verify using API
    }

    @And("driver initiates the journey")
    public void driverInitiatesTheJourney() {
        //API call
    }

    @Then("driver reaches to the pickup location")
    public void driverReachesToThePickUpLocation() {
        //API call
    }

    @When("driver completed the journey")
    public void driverCompleteTheJourney() {
        //API call
    }


}
