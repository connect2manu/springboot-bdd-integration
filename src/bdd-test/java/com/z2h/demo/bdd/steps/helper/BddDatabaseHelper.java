package com.z2h.demo.bdd.steps.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BddDatabaseHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(BddDatabaseHelper.class);

//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    public boolean executeDbQuery(String sql) {
//        if(jdbcTemplate != null) {
//            jdbcTemplate.execute(sql);
//            return true;
//        }
        return true;
    }

    public void setupFreshTestDataForDemoScenario() {
        LOGGER.info("++ cleaning any stale data and setup fresh demo test data");
    }

    public void cleanupDemoTestData() {
        LOGGER.info("++ cleaning any stale data and setup fresh demo test data");
        String sql = "Delete from some table";
        executeDbQuery(sql);
    }
}
