package com.orangehrmlive.com.testsuite;

import com.orangehrmlive.com.pages.LoginPage;
import com.orangehrmlive.com.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test

    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
    }
}
