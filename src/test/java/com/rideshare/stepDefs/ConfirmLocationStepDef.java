package com.rideshare.stepDefs;

import com.rideshare.screens.ConfirmLocationPage;
import io.cucumber.java.en.And;

public class ConfirmLocationStepDef {

    @And("User confirm the Location")
    public void userConfirmTheLocation() {
        new ConfirmLocationPage()
                .clickOnConfirmLocation();
    }

}
