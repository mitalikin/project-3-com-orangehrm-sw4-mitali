package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPassword extends Utility {
    By forgotPasswordField=By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    public  void clickOnForgotPassword(){
        clickOnElement(forgotPasswordField);
    }
    By resetPasswordText=By.xpath("//h6[text()='Reset Password']");
    public  String getResetPassword(){
        return getTextFromElement(resetPasswordText);
    }





}
