package com.z2h.demo.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {

    UserServiceImpl userService = new UserServiceImpl();

    @Test
    public void testPrintUserName() {
        String userName = "Manu";
        String expectedOutput = UserServiceImpl.USER_GREETING_MSG_PREFIX + userName;

        String result = userService.printUserName(userName);

        Assert.assertEquals(expectedOutput, result);
    }
}