package com.rideshare.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class BookAutoPage extends BasePage{

    //Dummy Xpath
    @AndroidFindBy(xpath = "//*[contains(@resource-id, 'auto')]")
    @iOSXCUITFindBy(id = "")
    private MobileElement auto;

    @AndroidFindBy(id = "Done")
    @iOSXCUITFindBy(id = "Done")
    private MobileElement doneButton;

    @AndroidFindBy(id = "BookAutoButton")
    @iOSXCUITFindBy(id = "BookAutoButton")
    private MobileElement bookAutoButton;

    public BookAutoPage userSelectVehicleType(){
        click(auto);
        click(doneButton);
        return this;
    }

    public BookAutoPage clickOnBookAuto(){
        click(bookAutoButton);
        return this;
    }

    public boolean isBookAutoPage(){
       waitForVisibility(bookAutoButton);
       return bookAutoButton.isDisplayed();
    }

}
