package com.alibaba;

import org.junit.Test;


import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilTest {
    @Test
    public void getPropertyTest() throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(Utils.getCurrentDir() + "\\config.properties"));
        
        System.out.println(Utils.getProperty("username"));
    }
}