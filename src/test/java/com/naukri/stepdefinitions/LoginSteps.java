package com.naukri.stepdefinitions;

import com.naukri.pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;

import com.naukri.base.BaseTest;

public class LoginSteps {
    WebDriver driver = BaseTest.driver;
    LoginPage loginPage = new LoginPage(driver);

   // LoginPage loginPage;
    @Before
    public void setup() {
        BaseTest.setup();  // Initialize WebDriver before test execution
        loginPage = new LoginPage(driver);
    }

    @Given("User is on the Naukri login page")
    public void user_is_on_naukri_login_page() {
        loginPage.openLoginPage();
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.enterCredentials("bharathkqa8@gmail.com", "Welcome@7386");
    }

    @And("User clicks on the login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLogin();
    }
}
