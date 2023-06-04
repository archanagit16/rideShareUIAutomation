package com.rideshare.screens;

import com.github.javafaker.Faker;
import com.rideshare.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BasePage {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "continueWithPhoneNumberButton")
    @iOSXCUITFindBy(accessibility = "button-continueWithPhoneNumber")
    private MobileElement continueWithPhoneNumber;

    @AndroidFindBy(id = "phoneNumber")
    @iOSXCUITFindBy(accessibility = "test-enterPhoneNumberField")
    private MobileElement enterPhoneNumber;

    @AndroidFindBy(id = "nextButton")
    @iOSXCUITFindBy(accessibility = "test-nextButton")
    private MobileElement nextButton;

    @AndroidFindBy(accessibility = "test-otp")
    @iOSXCUITFindBy(id = "test-enterOTP")
    private MobileElement otp;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"test-Error message\"]/child::XCUIElementTypeStaticText")
    private MobileElement errTxt;

    public void userIsLoggedIn(){
        waitForVisibility(continueWithPhoneNumber);
        click(continueWithPhoneNumber);
        sendKeys(enterPhoneNumber, new Faker().phoneNumber().toString());
        sendKeys(otp, "12345");   // We can fetch the OTP from DB;
    }

}

