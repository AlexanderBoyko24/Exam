package com.bigshop.steps;

import com.bigshop.page.LoginPage;
import com.bigshop.page.MainPage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class LoginSteps {

    private final LoginPage loginPage;
    private final MainPage mainPage;

    public void login(String username, String password) {
        log.info("user logs in to app with username and password");
        loginPage.login(username, password);
    }

}
