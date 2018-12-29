package com.z2h.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);
    public static final String USER_GREETING_MSG_PREFIX = "HELLO ";

    @Override
    public String printUserName(String name) {
        LOG.info("inside UserServiceImpl > printUserName() > HELLO {}", name);
        return USER_GREETING_MSG_PREFIX + name;
    }
}