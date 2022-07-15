package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "html:target/cucumber-report.html",  //html report
                    "rerun:target/rerun.txt", //rerun is coming from cucumber, it keeps track of the FAILED scenarios.
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber", //cucumber report
                    "json:target/cucumber.json"
            },
            features = "src/test/resources/features" ,
            glue = "com/cydeo/step_definitions",
            dryRun = false, //whenever you need snippets you turn dryRun on, otherwise keep it off, we are changing ture to get the snippets
            tags = "@smoke",  // it will run all @smoke test scenarios // when the tag is empty, then it will run everything
            publish = false
    )
    public class CukesRunner {


    }

