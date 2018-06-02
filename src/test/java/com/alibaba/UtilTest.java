package com.alibaba;

import org.junit.Test;


import java.util.Properties;
import java.io.FileInputStream;

public class UtilTest {
    @Test
    public void getPropertyTest() {
        Properties properties = new Properties();
        String currentDir = System.getProperty("user.dir");
        properties.load(new FileInputStream(currentDir + "\\config.properties"));
        
        //System.out.println(Utils.getProperty("username"))
    }
}