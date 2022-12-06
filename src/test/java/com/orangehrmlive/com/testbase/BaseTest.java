package com.orangehrmlive.com.testbase;

import com.orangehrmlive.com.propertyreader.PropertyReader;
import com.orangehrmlive.com.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
