package day06;

import org.testng.annotations.Test;
import page.AmazonPage;
import utils.HooksWeb;

public class C07_BrowserTest extends HooksWeb {

    AmazonPage amazonPage = new AmazonPage(androidDriver);

    @Test
    public void test01() {
        androidDriver.get("https://www.amazon.com");
    }

    @Test
    public void searchTextBox() {
        androidDriver.get("https://www.amazon.com");
        amazonPage.executeElement(amazonPage.searchTextBoxJS("mobile phone"));
        //amazonPage.executeElement(amazonPage.searchTextBoxJS("Mobile Phone"));
        amazonPage.executeElement(amazonPage.clickSearchBoxJS());
    }
}
