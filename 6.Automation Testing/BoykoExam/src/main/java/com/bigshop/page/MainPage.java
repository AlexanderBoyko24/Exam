package com.bigshop.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {

    @FindBy(id = "dropdownMenuUser")
    private WebElement myAccounts;

    public boolean isMyAccountDisplayed() {
        return myAccounts.isDisplayed();
    }
}
