package com.naukri.stepdefinitions;

import com.naukri.pages.LogoutPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import com.naukri.base.BaseTest;

public class LogoutSteps {
    WebDriver driver = BaseTest.driver;
    LogoutPage logoutPage = new LogoutPage(driver);

    @When("User clicks on logout button")
    public void user_clicks_on_logout_button() {
        logoutPage.clickLogout();
        driver.quit();
    }
}
