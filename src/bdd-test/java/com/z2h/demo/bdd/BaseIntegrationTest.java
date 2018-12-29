package com.z2h.demo.bdd;

import com.z2h.demo.BddDemoApplication;
import com.z2h.demo.config.TestConfig;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@SpringBootTest(classes = {TestConfig.class, BddDemoApplication.class})
@ActiveProfiles("test")
public abstract class BaseIntegrationTest {
}

