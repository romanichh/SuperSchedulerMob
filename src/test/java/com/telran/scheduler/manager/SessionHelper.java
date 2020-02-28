package com.telran.scheduler.manager;

import com.telran.scheduler.model.User;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class SessionHelper extends HelperBase {


    public SessionHelper(AppiumDriver driver) {
        super(driver);
    }

    public void fillLogInForm(User user) throws InterruptedException {
        type(By.id("log_email_input"), user.getUserName());
        Thread.sleep(6000);
        type(By.id("log_password_input"), user.getPassword());
        driver.hideKeyboard();
    }

    public void tapLoginButton() {
        tap(By.id("login_btn"));
//        tap(By.xpath("//*[contains(text(), 'LOGIN')]"));
    }
}
