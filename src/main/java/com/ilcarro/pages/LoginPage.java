package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(css = "button[type='submit']")
    WebElement yallaButton;

    public LoginPage clickYallaButton() {
        click(yallaButton);
        return this;
    }

    @FindBy(id = "email")
    WebElement emailInput;
    @FindBy(id = "password")
    WebElement passwordInput;

    public LoginPage enterData(String email, String password) {
        type(emailInput,email);
        type(passwordInput,password);
        return this;
    }

}
