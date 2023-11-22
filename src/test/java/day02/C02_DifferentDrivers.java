package day02;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class C02_DifferentDrivers {

    // If we only test on the Android apps, it is suggested to use AndroidDriver
    // If we test Android and IOS apps, we should use AppiumDriver
    // if you will not test ios apps, no need to use AppiumDriver
    AppiumDriver<MobileElement> appiumDriver;

    DesiredCapabilities capabilities = new DesiredCapabilities();

    @Test(priority = 1)
    public void isCalculatorAppInstalled() throws MalformedURLException {
        capabilities.setCapability("deviceName", "Pixel 7 API 33"); // the name of device
        capabilities.setCapability("platformName", "Android");// the name of the system
        capabilities.setCapability("platformVersion", "13.0");// version no
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/app/Calculator.apk");
        appiumDriver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723"), capabilities);
        //to test for isAppInstalled we should find the bundled id of the application
        // download Apk info from the apk pure website
        Assert.assertTrue(appiumDriver.isAppInstalled("com.google.android.calculator"));
    }

    /**
     * If you are using Node.js, Java does not have direct access to MobileCapabilityType,
     * so there may be a risk of errors.
     */
    @Test(priority = 2)
    public void capabilityTypes() throws MalformedURLException {
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7 API 33"); // the name of device
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");// the name of the system
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");// version no
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/app/Calculator.apk");
        appiumDriver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723"), capabilities);
    }
}