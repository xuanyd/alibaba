package com.alibaba;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Utils {

    private static Properties properties = new Properties();

    static {
        String currentDir = System.getProperty("user.dir");
        try {
			properties.load(new FileInputStream(currentDir + "\\config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
    
    public static String getCurrentDir() {
    	return System.getProperty("user.dir");
    }
}