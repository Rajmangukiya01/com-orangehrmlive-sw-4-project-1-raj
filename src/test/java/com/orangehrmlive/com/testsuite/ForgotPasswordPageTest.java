package com.orangehrmlive.com.testsuite;

import com.orangehrmlive.com.pages.ForgotPasswordPage;
import com.orangehrmlive.com.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordPageTest extends BaseTest {
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPasswordPage.clickOnForgotPasswordLink();
        Assert.assertEquals(forgotPasswordPage.verifyResetPasswordText(),"Reset Password","Reset Password text is not displayed");
    }
}
