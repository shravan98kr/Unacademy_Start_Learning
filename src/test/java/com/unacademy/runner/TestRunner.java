package com.unacademy.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Capgemini\\Unacademy\\src\\test\\resources\\AppFeature\\UnacademyStartLearningCompetativeExams.feature",
                 glue = {"com.unacademy.stepdefinations"},
                 dryRun = false,
                 monochrome = true)
public class TestRunner {

}
