package com.orangehrmlive.com.pages;

import com.orangehrmlive.com.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("//button[contains(@class,'oxd-button')]");


    public void enterUsername(String text) {
        sendTextToElements(username, text);
    }

    public void enterPassword(String text) {
        sendTextToElements(password, text);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
}
