package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Login link")
    public void click_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters correct data")
    public void enter_correct_data() {
        new LoginPage(driver).enterData("bobget@gh.com","123!@#QwAs");
    }

    @And("User clicks on Yalla button")
    public void click_on_Yalla_button() {
        new LoginPage(driver).clickYallaButton();
    }

    @Then("User verifies Success message is displayed")
    public void verify_Success_message() {
        new HomePage(driver).verifyMessage("Logged in success");
    }

    @And("User closes browser")
    public void close_browser() {
        new HomePage(driver).closeBrowser();
    }
}
