package com.orangehrmlive.com.testsuite;

import com.orangehrmlive.com.pages.DashboardPage;
import com.orangehrmlive.com.pages.LoginPage;
import com.orangehrmlive.com.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void verifyDashboardTextIsDisplayed() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedText = "Dashboard";
        Assert.assertEquals(dashboardPage.getDashboardText(),expectedText,"Dashboard text is not displayed");
    }
}
