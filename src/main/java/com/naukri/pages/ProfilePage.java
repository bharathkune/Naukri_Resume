package com.naukri.pages;

import java.time.Duration;
import org.testng.Assert;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage {

	WebDriver driver;

	
	By View = By.className("nI-gNb-drawer__bars");
	By ViewLink = By.className("nI-gNb-info__sub-link");
    //By profileTab = By.id("profile-tab");
    By uploadResume = By.xpath("//input[@value=\"Update resume\"]");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToProfile() {
    	
    	driver.findElement(View).click();
    	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(ViewLink));
		driver.findElement(ViewLink).click();
		
		

       
    }

    public void uploadResume(String filePath) throws InterruptedException {
    	
    	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));

    	w.until(ExpectedConditions.visibilityOfElementLocated(uploadResume));
		
		 WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
	        // Make the hidden input visible using JavaScript
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].style.display='block';", fileInput);
	     fileInput.sendKeys(filePath);
        //driver.findElement(uploadResume).sendKeys(filePath);
	     //driver.findElement(profileTab).click();
	        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Resume has been successfully uploaded')]")).isDisplayed());
			
			Thread.sleep(5000);		
			System.out.println("Process completed");
			
			driver.findElement(View).click();			
			
        
        
    }
    
}
