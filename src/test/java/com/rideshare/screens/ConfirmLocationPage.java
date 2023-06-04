package com.rideshare.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ConfirmLocationPage extends BasePage{


    //Dummy Xpath
    @AndroidFindBy(id = "confirmLocation")
    @iOSXCUITFindBy(id = "")
    private MobileElement confirmLocationButton;


    public ConfirmLocationPage clickOnConfirmLocation(){
        click(confirmLocationButton);
        return this;
    }
}
