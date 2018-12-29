package com.z2h.demo;

import com.z2h.demo.annotations.IntegrationTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@IntegrationTest
public class BddDemoAppStartupIntegrationTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BddDemoAppStartupIntegrationTest.class);

    @Test
    public void contextLoads() {
        LOGGER.info("Verifying graceful loading of spring context.");
    }
}