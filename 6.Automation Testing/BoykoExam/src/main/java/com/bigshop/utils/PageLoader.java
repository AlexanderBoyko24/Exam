package com.bigshop.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PageLoader {

    private static final int DRIVER_WAIT_TIME = 10;
    private final WebDriver driver;

    public PageLoader(WebDriver driver) {
        this.driver = driver;
    }



    private WebDriverWait getWait() {
        return new WebDriverWait(this.driver, Duration.ofSeconds(DRIVER_WAIT_TIME));
    }

    private WebDriverWait getWait(int waitTime) {
        return new WebDriverWait(this.driver, Duration.ofSeconds(waitTime));
    }
}