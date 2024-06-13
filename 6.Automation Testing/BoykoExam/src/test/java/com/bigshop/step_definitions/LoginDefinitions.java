package com.bigshop.step_definitions;

import com.bigshop.steps.LoginSteps;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class LoginDefinitions {
    private final LoginSteps loginSteps;

    @When("the user enters correct {word} and {word}")
    public void theUserEntersCorrectUsernameAndPassword(String username, String password) {
        loginSteps.login(username, password);
    }
}
