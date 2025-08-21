package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    private By checkoutBtn = By.id("checkout");
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By finishBtn = By.id("finish");
    private By confirmationMsg = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void startCheckout() {
        click(checkoutBtn);
    }

    public void enterCustomerInfo(String fName, String lName, String zip) {
        type(firstName, fName);
        type(lastName, lName);
        type(postalCode, zip);
        click(continueBtn);
    }

    public void finishCheckout() {
        click(finishBtn);
    }

    public String getConfirmationMessage() {
        return getText(confirmationMsg);
    }
}
