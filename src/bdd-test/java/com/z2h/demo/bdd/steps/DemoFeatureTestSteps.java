package com.z2h.demo.bdd.steps;

import com.z2h.demo.bdd.BaseIntegrationTest;
import com.z2h.demo.bdd.steps.helper.BddDatabaseHelper;
import com.z2h.demo.service.UserService;
import com.z2h.demo.service.UserServiceImpl;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class DemoFeatureTestSteps extends BaseIntegrationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoFeatureTestSteps.class);

    @Autowired
    UserService userService;

    @Autowired
    private BddDatabaseHelper bddDatabaseHelper;

    @Given("^some service exists$")
    public void some_service_exists() throws Throwable {
        LOGGER.info("++ GIVEN -> some_service_exists()");
//        initializeAndVerifyConnectivity();
    }

    @And("^setup clean & fresh test data$")
    public void setup_test_data() throws Throwable {
        LOGGER.info("++ AND -> setup_test_data()");
        bddDatabaseHelper.setupFreshTestDataForDemoScenario();
    }

    @When("^the client calls service$")
    public void the_client_calls_service() throws Throwable {
        LOGGER.info("++ WHEN -> the_client_calls_service()");
//        startService();
    }

    @Then("^verify expected result$")
    public void verify_expected_result() throws Throwable {
        LOGGER.info("++ THEN -> verify_expected_result()");

        String userName = "Manu";
        String expectedOutput = UserServiceImpl.USER_GREETING_MSG_PREFIX + userName;

        String result = "";
        try {
            result = invokeService(userName);
        } finally {
            Assert.assertEquals(expectedOutput, result);
        }
        LOGGER.info("-- verify_expected_result()");
    }

    @And("^cleanup demo test data$")
    public void cleanup_demo_test_data() throws Throwable {
        LOGGER.info("++ AND -> cleanup_demo_test_data()");
        bddDatabaseHelper.cleanupDemoTestData();
    }

    private String invokeService(String userName) {
        // Some call to actual service to perform some action under test
        String result = userService.printUserName(userName);
        LOGGER.info("Service invoked.");
        return result;
    }
}
