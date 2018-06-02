package com.alibaba;

import org.junit.Test;

public class LoginTest {
    @Test
    public void testLogin() {
        Login login = new Login();
        login.login("123", "123");
    }
}