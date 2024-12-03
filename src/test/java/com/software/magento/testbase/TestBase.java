package com.software.magento.testbase;

import com.software.magento.propertyreader.PropertyReader;
import com.software.magento.utilies.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    //get the browser
    String browser = PropertyReader.getInstance().getProperty("browser");

    //Open browser
    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }

    //close the browser
    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
