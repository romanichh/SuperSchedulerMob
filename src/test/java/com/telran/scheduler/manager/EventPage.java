package com.telran.scheduler.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class EventPage extends HelperBase {

    public EventPage(AppiumDriver driver) {
        super(driver);
    }

    public boolean isPlusButtonPresent() {
        return isElementPresent(By.id("fab_main"));
    }
}
