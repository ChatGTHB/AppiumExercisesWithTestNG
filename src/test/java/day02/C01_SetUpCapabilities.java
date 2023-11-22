package day02;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class C01_SetUpCapabilities {

    // Set-up Appium Environments

    // 1st step : Create androidDriver from the AndroidDriver class
    AndroidDriver<AndroidElement> androidDriver;

    // 2nd step : Create capabilities object from the DesiredCapabilities class
    DesiredCapabilities capabilities = new DesiredCapabilities();

    /**
     * Why do we need to use capabilities?
     * 1- We should define name of the emulator, operating system, url, automation name, app name
     * 2- Capabilites are working as a key-value
     */

    @Test
    public void setUpCalculator() {

        capabilities.setCapability("deviceName", "Pixel 7 API 33");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("automationName", "UiAutomator2");
        // Download an application from the apkPure
        // create a directory with name app under the project name then drag and drop the downloaded app
        capabilities.setCapability("app", "");
    }
}
