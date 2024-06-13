package com.bigshop.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/login/Login.feature"},
        glue = {"com.bigshop.step_definitions", "com.bigshop.hooks"},
        plugin = {"pretty",
                "json:test-output/cucumber-reports/Cucumber.json",
                //                 "xml:test-output/cucumber-reports/Cucumber.xml",
                "html:test-output/cucumber-reports/Cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)


public class TestNGRunTest extends AbstractTestNGCucumberTests {
}
