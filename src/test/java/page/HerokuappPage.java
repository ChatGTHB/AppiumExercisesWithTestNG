package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import utils.HooksWeb;

public class HerokuappPage extends HooksWeb {

    public HerokuappPage(AndroidDriver<WebElement> driver) {
        this.androidDriver = driver;
    }

    // Java Script Path
    public String usernameJS(String username) {
        return "document.querySelector(\"#username\").value='" + username + "';";
    }

    public String passwordJS(String password) {
        return "document.querySelector(\"#password\").value='" + password + "';";
    }

    public String clickLoginButtonJS() {
        return "document.querySelector(\".fa.fa-2x.fa-sign-in\").click();";
    }

    public void executeElement(String element) {
        androidDriver.executeScript(element);
    }
}
