package com.utest.qvision.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "feature/QVision.feature",
        glue = "com.utest.qvision.stepdefinitions")

public class RegistrationAndVerificationRunner {	
	
}
