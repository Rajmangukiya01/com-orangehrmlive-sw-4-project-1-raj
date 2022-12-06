package com.orangehrmlive.com.pages;

import com.orangehrmlive.com.utility.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {
    By dashboardText = By.xpath("//h6[contains(@class,'oxd-text')]");

    public String getDashboardText() {
        return getTextFromElement(dashboardText);
    }
}
