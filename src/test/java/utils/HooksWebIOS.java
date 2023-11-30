package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HooksWebIOS {

    public static AppiumDriver androidDriver;
    static DesiredCapabilities capabilities = new DesiredCapabilities();
    @BeforeMethod
    public void setUp() {
        try {
            capabilities.setCapability("deviceName", "iPhone 11 Pro");
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("platformVersion", "15.6.1");
            capabilities.setCapability("browserName", "safari");
            capabilities.setCapability("safari:useSimulator", true);
            androidDriver = new IOSDriver(new URL("http://127.0.0.1:4723"), capabilities);
            androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException exception) {
            System.err.println("Malformed URL Exception: " + exception.getMessage());
        }
    }
}
