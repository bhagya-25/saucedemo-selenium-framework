package com.saucedemo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	 private static Properties properties = new Properties();

	    static {
	        try {
	            FileInputStream fis = new FileInputStream("src\\test\\resources\\config.properties");
	            properties.load(fis);
	        } catch (IOException e) {
	            throw new RuntimeException("Failed to load config.properties file", e);
	        }
	    }

	    public static String get(String key) {
	        String value= properties.getProperty(key);
	        if (value == null || value.trim().isEmpty()) {
	            throw new RuntimeException("Missing or empty key in config.properties: " + key);
	        }
	        return value;
	    }
}
