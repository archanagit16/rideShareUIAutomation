package com.rideshare.stepDefs;

import com.rideshare.screens.BookAutoPage;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class BookAutoStepDef{

    @And("User clicks on Book Auto")
    public void userClickOnBookAuto() {
        new BookAutoPage()
                .userSelectVehicleType()
                .clickOnBookAuto();
    }

    @And("User is on book auto page")
    public void userIsOnBookAutoPage() {
        Assert.assertTrue(new BookAutoPage().isBookAutoPage(), "Book Auto page is not displayed");

    }
}
