package com.naukri.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
    public static WebDriver driver;
    
    public static void setup() {
        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
    	if (driver == null) {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    	}
    }
    
    public static WebDriver getDriver() {
        return driver;
    }
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
}
