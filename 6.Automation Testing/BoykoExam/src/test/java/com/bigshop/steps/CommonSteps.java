package com.bigshop.steps;

import com.bigshop.page.LoginPage;
import com.bigshop.page.MainPage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@Slf4j
@AllArgsConstructor
public class CommonSteps {
    private final LoginPage loginPage;
    private final MainPage mainPage;

    public void checkLoginPageIsOpen() {
        log.info("Check login page is open");
        assertThat(loginPage.isLoginPageDisplayed()).
                as("the login page is not displayed")
                .isTrue();
    }

    public void checkUserLoggedIn() {
        log.info("Check user is logged in");
        assertThat(mainPage.isMyAccountDisplayed())
                .as("My account of main page is not displayed")
                .isTrue();
    }
}
