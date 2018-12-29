package com.z2h.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppConfig {
    private static final Logger LOG = LoggerFactory.getLogger(AppConfig.class);

    @Autowired
    private Environment env;

}