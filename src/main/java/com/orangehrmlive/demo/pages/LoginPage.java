package com.orangehrmlive.demo.pages;

import com.google.common.base.Verify;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    //* Enter “Admin” username
    By UserNameField = By.name("username");

    public void enterUserName(String username) {
        sendTextToElement(UserNameField, username);
    }

    //* Enter “admin123“ password
    By passwordField = By.name("password");

    public void enterPassword(String passcode) {
        sendTextToElement(passwordField, passcode);
    }
    //* Click on ‘LOGIN’ button

    By clickOnLoginButton = By.xpath("//button[@type='submit']");

    public void clickOnLoginButton() {
        clickOnElement(clickOnLoginButton);
    }

    //* Verify the ‘Dashboard’ text is display
    By dashBoardText = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public String getTextDashBoard() {
        return getTextFromElement(dashBoardText);
    }
}
