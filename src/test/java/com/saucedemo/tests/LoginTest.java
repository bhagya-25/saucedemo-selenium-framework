package com.saucedemo.tests;

import org.testng.annotations.Test;
import com.saucedemo.pages.LoginPage;

public class LoginTest extends BaseTest {

	
    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        assert driver.getCurrentUrl().contains("inventory");
    }
}
