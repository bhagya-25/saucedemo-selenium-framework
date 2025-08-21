package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    private By firstAddToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By cartIcon = By.className("shopping_cart_link");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addFirstProductToCart() {
        click(firstAddToCartBtn);
    }

    public void goToCart() {
        click(cartIcon);
    }
}
