package com.rideshare.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage extends BasePage {

    //Dummy Xpath
    @AndroidFindBy(id = "search-destination")
    @iOSXCUITFindBy(id = "search-destination")
    private MobileElement searchDestinationTextBox;

    @AndroidFindBy(xpath = ".//android.widget.TextView[@resource-id='com.dunzo.user.debug:id/savedAs'\" +\n" +
            "                                \"and @text='\" + locationName + \"']")
    @iOSXCUITFindBy(xpath = " \"[`label == \\\"\" + locationName + \"\\\"`]\"));\n")
    private MobileElement searchDestinationText;

    public HomePage clickOnSearchDestination() {
        waitForVisibility(searchDestinationTextBox);
        click(searchDestinationTextBox);
        return this;
    }

    public HomePage searchLocation(String location) {
        waitForVisibility(searchDestinationTextBox);
        sendKeys(searchDestinationTextBox, location);
        return this;
    }

    public HomePage selectSearchedLocation() {
        waitForVisibility(searchDestinationText);
        click(searchDestinationText);
        return this;
    }

    public boolean isHomePage(){
        waitForVisibility(searchDestinationTextBox);
        return searchDestinationTextBox.isDisplayed();
    }
}
