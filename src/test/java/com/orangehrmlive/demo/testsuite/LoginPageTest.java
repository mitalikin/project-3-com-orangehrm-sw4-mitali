package com.orangehrmlive.demo.testsuite;

import com.google.common.base.Verify;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {
    // LoginPage loginPage= new LoginPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //* Enter “Admin” username
        loginPage.enterUserName("Admin");
        //      * Enter “admin123“ password
        loginPage.enterPassword("admin123");
        //     * Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        //   * Verify the ‘Dashboard’ text is display
        String expectedErrorMessage1 = "Dashboard";
        Assert.assertEquals(loginPage.getTextDashBoard(), expectedErrorMessage1, "Error message not displayed");

    }



}
