package day03;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Driver;

public class C05_Trendyol {

    Driver driver = new Driver();

    @BeforeTest
    public void setUp() {

        driver.getAndroidDriver();
    }

    @Test
    public void test01() {

    }


    @AfterTest
    public void tearDown() {
        driver.closeAppiumDriver();
    }
}
