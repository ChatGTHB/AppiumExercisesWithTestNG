package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    public static AndroidDriver<AndroidElement> androidDriver;
    static DesiredCapabilities capabilities = new DesiredCapabilities();

    public static AndroidDriver getAndroidDriver() {
        URL appiumServerUrl = null;
        try {
            appiumServerUrl = new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException exception) {
            System.out.println(exception.getMessage());
        }

        if (androidDriver == null) {
            capabilities.setCapability("deviceName", ConfigReader.getProperty("deviceName"));
            capabilities.setCapability("platformName", ConfigReader.getProperty("platformName"));
            capabilities.setCapability("platformVersion", ConfigReader.getProperty("platformVersion"));
            capabilities.setCapability("automationName", ConfigReader.getProperty("automationName"));
            capabilities.setCapability("app", System.getProperty("user.dir") + ConfigReader.getProperty("app"));
            capabilities.setCapability("noReset", true);
            // When set to false, the application is reset at the beginning of each test and starts from the beginning.
            // It doesn't leave anything in memory, it clears it automatically.
        }
        if (ConfigReader.getProperty("platformName").equals("Android")) {
            assert appiumServerUrl != null;
            androidDriver = new AndroidDriver<AndroidElement>(appiumServerUrl, capabilities);
            androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } else {
            throw new UnsupportedOperationException("Invalid Platform Name");
        }
        return androidDriver;
    }

    public static void closeAppiumDriver() {
        if (androidDriver != null) {
            androidDriver.closeApp();
            androidDriver = null;
        }
    }

    public static void quitAppiumDriver() {
        if (androidDriver != null) {
            androidDriver.quit();
            androidDriver = null;
        }
    }
}
