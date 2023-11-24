package day04;

import io.appium.java_client.TouchAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.AndroidTestPage;
import utils.Driver;
import utils.ReusableMethods;

import static io.appium.java_client.touch.offset.PointOption.point;

public class C05_AndroidTestApk {

    Driver driver = new Driver();
    AndroidTestPage androidTestPage = new AndroidTestPage();
    ReusableMethods reusableMethods = new ReusableMethods();

    @BeforeTest
    public void setUp() {
        driver.getAndroidDriver();
    }
    @Test
    public void tabOnThePointwithTouchAction() {
        // TouchAction class has similar features to Action class in Selenium.
        // Note: The points we receive may vary depending on the device we use, let's be careful about this.
        TouchAction action = new TouchAction(driver.getAndroidDriver()) ;
        action.tap(point(86,207)).perform();
        reusableMethods.waitFor(3);
        action.tap(point(76,1511)).perform();
        reusableMethods.waitFor(3);
        action.tap(point(220,835)).perform();
        action.tap(point(347,1090)).perform();
    }
    @Test
    public void dynamicTabMethodUsing(){
        reusableMethods.tabOnThePoints(86,207);
        reusableMethods.waitFor(3);
    }

    @AfterTest
    public void tearDown() {
        // driver.closeAppiumDriver();
    }
}
