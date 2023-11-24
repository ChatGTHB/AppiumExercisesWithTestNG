package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AndroidTestPage {

    public AndroidTestPage() {
        PageFactory.initElements(Driver.getAndroidDriver(), this);
    }

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"Username input field\"]")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"Password input field\"]")
    public WebElement passwordTextBox;

    //********************************************* Methods ****************************************************************
    public void usernameTextBoxSendKey(String key) {
        usernameTextBox.sendKeys(key);
    }

    public void passwordTextBoxSendKey(String key) {
        passwordTextBox.sendKeys(key);
    }
}
