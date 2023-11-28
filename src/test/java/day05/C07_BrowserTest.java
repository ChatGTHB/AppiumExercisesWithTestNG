package day05;

import org.testng.annotations.Test;
import utils.HooksWeb;

public class C07_BrowserTest extends HooksWeb {

    @Test
    public void test01(){
        androidDriver.get("https://www.trendyol.com");
    }
}
