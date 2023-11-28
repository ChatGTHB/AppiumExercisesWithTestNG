package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class HooksWeb {
    public static AndroidDriver<AndroidElement> androidDriver;
    static DesiredCapabilities capabilities = new DesiredCapabilities();
    @BeforeMethod
    public void setUp() {

        try {
            capabilities.setCapability("deviceName", ConfigReader.getProperty("deviceName"));
            capabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
            capabilities.setCapability("platformVersion", ConfigReader.getProperty("platformVersion"));
            capabilities.setCapability("automationName", ConfigReader.getProperty("automationName"));
            capabilities.setCapability("browserName","chrome");
            androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), capabilities);
        } catch (MalformedURLException exception) {
            System.err.println("Malformed URL Exception: " + exception.getMessage());
        }
    }
}
