package day03;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Driver;

public class C04_CreateDriverClass {

    // Create a package with name utils and create a class with name Driver
    // Create a class with name ConfigReader in the utils
    // Create configuration.properties under the project name

    Driver driver = new Driver();

    @BeforeTest
    public void setUp() {

        driver.getAndroidDriver();
    }

    @Test (priority = 1)
    public void multiplicationTest() {
        driver.androidDriver.findElementByAccessibilityId("7").click();
        driver.androidDriver.findElementByAccessibilityId("5").click();
        driver.androidDriver.findElementByAccessibilityId("multiply").click();
        driver.androidDriver.findElementByAccessibilityId("8").click();
        driver.androidDriver.findElementByAccessibilityId("equals").click();
    }

    @Test (priority = 2)
    public void additionTest() {
        driver.androidDriver.findElementByAccessibilityId("7").click();
        driver.androidDriver.findElementByAccessibilityId("5").click();
        driver.androidDriver.findElementByAccessibilityId("plus").click();
        driver.androidDriver.findElementByAccessibilityId("9").click();
        driver.androidDriver.findElementByAccessibilityId("5").click();
        driver.androidDriver.findElementByAccessibilityId("equals").click();
    }

    @Test (priority = 3)
    public void subtractionTest() {
        driver.androidDriver.findElementByAccessibilityId("9").click();
        driver.androidDriver.findElementByAccessibilityId("5").click();
        driver.androidDriver.findElementByAccessibilityId("minus").click();
        driver.androidDriver.findElementByAccessibilityId("9").click();
        driver.androidDriver.findElementByAccessibilityId("5").click();
        driver.androidDriver.findElementByAccessibilityId("equals").click();
    }

    @Test (priority = 4)
    public void divisionTest() {
        driver.androidDriver.findElementByAccessibilityId("9").click();
        driver.androidDriver.findElementByAccessibilityId("5").click();
        driver.androidDriver.findElementByAccessibilityId("divide").click();
        driver.androidDriver.findElementByAccessibilityId("9").click();
        driver.androidDriver.findElementByAccessibilityId("5").click();
        driver.androidDriver.findElementByAccessibilityId("equals").click();
    }

    @AfterTest
    public void tearDown() {
        driver.closeAppiumDriver();
    }
}
