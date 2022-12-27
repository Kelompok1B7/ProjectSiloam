package com.juaracoding.ta.ProjectSiloam.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/01.LoginAdmin.feature",
        		"src/main/resources/features/02.View&Report.feature",
        		"src/main/resources/features/03.LoginSales.feature",
        		"src/main/resources/features/08.Return.feature",},
        glue = "com.juaracoding.ta.ProjectSiloam.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
