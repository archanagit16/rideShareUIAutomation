package com.rideshare.stepDefs;

import com.rideshare.screens.BookAutoPage;
import com.rideshare.screens.HomePage;
import com.rideshare.screens.TrackOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageStepDef {
    @When("User search for destination {string}")
    public void userSearchForDestination(String location) {
        new HomePage()
                .clickOnSearchDestination()
                .searchLocation(location)
                .selectSearchedLocation();
    }


    @Then("User is on Home page")
    public void userIsOnHomePage(){
        Assert.assertTrue(new HomePage().isHomePage(), "Home page is not displayed");
    }



}
