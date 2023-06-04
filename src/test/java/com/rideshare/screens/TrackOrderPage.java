package com.rideshare.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

import java.util.List;

public class TrackOrderPage extends BasePage {

    //Dummy Xpath
    @AndroidFindBy(id = "cancelRide")
    @iOSXCUITFindBy(id = "cancelRide")
    private MobileElement cancelRideButton;

    @AndroidFindBy(xpath = "//.*[text() = 'Your ride is confirmed']")
    @iOSXCUITFindBy(id = "")
    private MobileElement rideConfirmationMessage;

    @AndroidFindBy(xpath = "//.*[text() = 'Your ride has been verified.']")
    @iOSXCUITFindBy(id = "")
    private MobileElement rideVerifiedMessage;


    public TrackOrderPage verifyFieldsOnTrackOrderPageAfterDriverAcceptTheTask(List<String> expectedTextList) {
        for (String expectedText : expectedTextList) {
            Assert.assertTrue(isTextPresent(expectedText), expectedText + " is not displayed");
        }

        return this;
    }

    public TrackOrderPage clickOnCancelRide() {
        waitForVisibility(cancelRideButton);
        click(cancelRideButton);
        return this;
    }


    public boolean isTrackOrderPageAfterDriverAccpetTheTask() {
        waitForVisibility(rideConfirmationMessage);
        return rideConfirmationMessage.isDisplayed();
    }


    public boolean isTrackOrderPageAfterRideVerified() {
        waitForVisibility(rideVerifiedMessage);
        return rideVerifiedMessage.isDisplayed();
    }


}
