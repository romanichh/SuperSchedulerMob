package com.telran.scheduler.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationManager {
    AppiumDriver driver;
    SessionHelper session;
    EventPage event;

    public void init() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "qa22");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "com.example.svetlana.scheduler");
        capabilities.setCapability("appActivity", ".presentation.splashScreen.SplashScreenActivity");
        capabilities.setCapability("app",
                "C:/Users/romic/Downloads/v.0.0.3.apk");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        session = new SessionHelper(driver);
        event = new EventPage(driver);
    }

    public SessionHelper getSession() {
        return session;
    }

    public EventPage getEvent() {
        return event;
    }

    public void stop() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
