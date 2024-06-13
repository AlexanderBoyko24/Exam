package com.bigshop.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[@id='__next']/div[1]/section/div[2]/div/div/div/div/form/div[1]/input")
    private WebElement usernameInput;

    @FindBy(xpath = "//*[@id='__next']/div[1]/section/div[2]/div/div/div/div/form/div[2]/div/input")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id='__next']/div[1]/section/div[2]/div/div/div/div/form/div[4]/button")
    private WebElement loginButton;

    public boolean isLoginPageDisplayed() {
        return usernameInput.isDisplayed() && passwordInput.isDisplayed();
    }

    public void login(String username, String password) {
        try {
            usernameInput.sendKeys(username);
            Thread.sleep(1000);
            passwordInput.sendKeys(password);
            Thread.sleep(1000);
            loginButton.click();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}