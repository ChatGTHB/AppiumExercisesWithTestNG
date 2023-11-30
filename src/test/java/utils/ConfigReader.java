package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static {
        try {
            String filePath = "configuration.properties";
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException exception) {
            System.out.println("File could'nt be found");
        } catch (IOException exception) {
            System.out.println("File could'nt be load from properties file");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String get(String keyName) {

        return properties.getProperty(keyName);
    }
}
