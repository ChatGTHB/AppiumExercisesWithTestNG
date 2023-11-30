package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Hooks;

public class ApiDemosPage extends Hooks {

    public ApiDemosPage() {
        PageFactory.initElements(androidDriver, this);
    }

    public WebElement findelementByAccessibilityId(String id) {
        return androidDriver.findElementByAccessibilityId(id);
    }

    public WebElement getAccessibilityButton() {
        return findelementByAccessibilityId("Access'ibility");
    }

    public WebElement getViewsButton() {
        return findelementByAccessibilityId("Views");
    }

    public WebElement getListsButton() {
        return findelementByAccessibilityId("Lists");
    }

    public void clickElement(WebElement element) {
        element.click();
    }


}
