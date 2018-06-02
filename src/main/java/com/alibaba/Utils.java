package com.alibaba;

import java.util.Properties;
import java.io.FileInputStream;

public class Utils {

    private static Properties properties = new Properties();

    static {
        String currentDir = System.getProperty("user.dir");
        //properties.load(new FileInputStream(currentDir + "\\config.properties"));
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}