package day06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.HerokuappPage;
import utils.HooksWeb;

public class C08_HerokuapTest extends HooksWeb {

    /**
     * username : T  F  F  _ _ T F _
     * password : F  T  F  T F _ _ _
     */
    HerokuappPage herokuappPage = new HerokuappPage(androidDriver);

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"tomsmith", "SuperSecretPassword!", true},
                {"tomsmith", "12345", false},
                {"mehmet", "SuperSecretPassword!", false},
                {"mehmet", "Sezgin!", false},
                {" ", "SuperSecretPassword!", false},
                {" ", "mehmet", false},
                {"tomsmith", " ", false},
                {"mehmet", " ", false},
                {" ", " ", false},
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password, boolean expectedResult) {
        androidDriver.get("https://the-internet.herokuapp.com/login");
        herokuappPage.executeElement(herokuappPage.usernameJS(username));
        herokuappPage.executeElement(herokuappPage.passwordJS(password));
        herokuappPage.executeElement(herokuappPage.clickLoginButtonJS());
    }
}
