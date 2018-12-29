package com.z2h.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"com.z2h.demo"})
//@EnableTransactionManagement
public class TestConfig {
    private static final Logger LOG = LoggerFactory.getLogger(TestConfig.class);

/*  //Setup Datasource test configs, if needed.
    @Bean
    public DataSource dataSource() {
        LOG.debug("Creating test dataSource.");
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName();
        ds.setUrl();
        ds.setUsername();
        ds.setPassword(;
        ds.setInitialSize(5);
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        LOG.debug("initializing test jdbcTemplate.");
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "transactionManagerJdbc")
    public PlatformTransactionManager transactionManagerJdbc(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }*/
}