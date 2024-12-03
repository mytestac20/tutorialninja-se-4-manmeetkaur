package com.software.magento.pages;

import com.software.magento.utilies.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {

    //find all Locator
    By myAccountText = By.xpath("//h2[normalize-space()='My Account']");

    /**
     * This method will get the myAccount text
     */
    public String getMyAccountText(){
        return getTextFromElement(myAccountText);
    }
}