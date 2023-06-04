package com.rideshare.stepDefs;

import com.rideshare.screens.TrackOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class TrackOrderStepDef {

    @Then("User sees following fields on ride confirmed page")
    public void verifyFieldsOnTrackOrderPageAfterDriverAcceptTheTask(List<String> expectedList) {
        new TrackOrderPage().verifyFieldsOnTrackOrderPageAfterDriverAcceptTheTask(expectedList);
    }

    @And("User cancels the ride")
    public void userCancelsTheRide() {
        new TrackOrderPage().clickOnCancelRide();

    }

    @Then("User is on Your ride is confirmed page")
    public void userIsOnYourRideIsConfirmedPage() {
        Assert.assertTrue(new TrackOrderPage()
                        .isTrackOrderPageAfterDriverAccpetTheTask()
                , "Your ride is confirmed message is not displayed on track order page");

    }

    @Then("User is on Your ride has been verified page")
    public void userIsOnYourRideHasBeenVerifiedPage() {
        new TrackOrderPage().isTrackOrderPageAfterRideVerified();
        Assert.assertTrue(new TrackOrderPage()
                        .isTrackOrderPageAfterRideVerified()
                , "Your ride has been verified is not displayed on track order page");

    }

}
