package com.naukri.stepdefinitions;

import com.naukri.pages.ProfilePage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import com.naukri.base.BaseTest;

public class ProfileSteps {
    WebDriver driver = BaseTest.driver;
    ProfilePage profilePage = new ProfilePage(driver);

    @Given("User is on profile page")
    public void user_is_on_profile_page()  {
        profilePage.goToProfile();
    }

    @When("User uploads a new resume")
    public void user_uploads_a_new_resume() throws InterruptedException {
        profilePage.uploadResume("C:\\Users\\Admin\\Desktop\\Resume_Bharath\\bharathkqa8@gmail.com\\Bharath_Resume_Automation.pdf");
    }
}
