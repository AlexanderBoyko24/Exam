package com.bigshop.page;

import com.bigshop.driver.CustomWebDriverManager;
import com.bigshop.utils.PageLoader;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Getter
public abstract class BasePage {

    private final PageLoader pageLoader;
    private final WebDriver driver;

    public BasePage() {
        driver = CustomWebDriverManager.getDriver();
        pageLoader = new PageLoader(driver);
        PageFactory.initElements(driver, this);
    }
}