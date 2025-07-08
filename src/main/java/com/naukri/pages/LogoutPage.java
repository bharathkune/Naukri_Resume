package com.naukri.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage {

	WebDriver driver;

    By logoutButton = By.linkText("Logout");

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogout() {
    	
    	
        driver.findElement(logoutButton).click();
    }
}
