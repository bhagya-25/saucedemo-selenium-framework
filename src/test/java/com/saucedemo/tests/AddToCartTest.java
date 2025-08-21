package com.saucedemo.tests;

import org.testng.annotations.Test;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.pages.CartPage;

public class AddToCartTest extends BaseTest {

    @Test
    public void testAddProductToCart() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        ProductPage productPage = new ProductPage(driver);
        productPage.addFirstProductToCart();
        productPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        assert cartPage.isProductInCart("Sauce Labs Backpack");
    }
}
