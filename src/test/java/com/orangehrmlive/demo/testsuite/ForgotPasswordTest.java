package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.ForgotPassword;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

    ForgotPassword forgotPassword = new ForgotPassword();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link
        forgotPassword.clickOnForgotPassword();
        //* Verify the text ‘Reset Password’
        String expectedErrorMessage = "Reset Password";
        Assert.assertEquals(forgotPassword.getResetPassword(), expectedErrorMessage, "Error message not displayed");

    }


}
