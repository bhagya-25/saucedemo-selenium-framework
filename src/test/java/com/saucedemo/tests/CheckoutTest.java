package com.saucedemo.tests;

import org.testng.annotations.Test;
import com.saucedemo.pages.*;
import com.saucedemo.utils.ConfigReader;

public class CheckoutTest extends BaseTest {

    @Test
    public void testEndToEndCheckout() {
        new LoginPage(driver).login(
            ConfigReader.get("username"),
            ConfigReader.get("password")
        );

        ProductPage productPage = new ProductPage(driver);
        productPage.addFirstProductToCart();
        productPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        assert cartPage.isProductInCart("Sauce Labs Backpack");

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.startCheckout();
        checkoutPage.enterCustomerInfo(
            ConfigReader.get("firstname"),
            ConfigReader.get("lastname"),
            ConfigReader.get("zipcode")
        );
        checkoutPage.finishCheckout();

        assert checkoutPage.getConfirmationMessage().equals("Thank you for your order!");
    }
}
