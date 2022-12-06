package com.orangehrmlive.com.pages;

import com.orangehrmlive.com.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {
    By forgotPasswordLink = By.xpath("//p[text()='Forgot your password? ']");
    By resetPasswordText = By.xpath("//h6[text()='Reset Password']");

    public void clickOnForgotPasswordLink() {
        clickOnElement(forgotPasswordLink);
    }

    public String verifyResetPasswordText() {
        return getTextFromElement(resetPasswordText);
    }
}
