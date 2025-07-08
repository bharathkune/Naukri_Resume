package com.naukri.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naukri.base.BaseTest;

public class LoginPage {

	 WebDriver driver;
	 
	 By loginlayer   = By.id("login_Layer");
	 By usernameField = By.id("usernameField");
	 By passwordField = By.id("passwordField");
	 By loginButton = By.xpath("//button[@type='submit']");
	 
	 public LoginPage(WebDriver driver) {
	        this.driver = BaseTest.getDriver();
	    }
	 
	 public void openLoginPage() {
		 
		 
	        driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
	        driver.findElement(loginlayer).click();
	        
	    }
	 public void enterCredentials(String username, String password) {
	        driver.findElement(usernameField).sendKeys(username);
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLogin() {
	        driver.findElement(loginButton).click();
	        
	        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
			w.until(ExpectedConditions.visibilityOfElementLocated(By.className("view-profile-wrapper")));
	    }
}
