package com.z2h.demo.bdd;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "junit:target/junit-report.xml"}
        , features = "src/bdd-test/resources/features/demo.feature"
)
@ActiveProfiles(value = "test")
public class DemoFeatureRunner {
}




