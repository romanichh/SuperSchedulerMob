package com.telran.scheduler.tests;

import com.telran.scheduler.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void testLogin() throws InterruptedException {
        app.getSession().pause(6000);
        app.getSession().fillLogInForm(new User().withUserName("romich87@gmail.com").withPassword("Qaqaqaqa"));
        app.getSession().tapLoginButton();
        app.getSession().pause(6000);

        Assert.assertTrue(app.getEvent().isPlusButtonPresent());
    }


}
