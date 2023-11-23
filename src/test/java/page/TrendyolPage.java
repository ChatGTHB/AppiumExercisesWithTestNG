package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class TrendyolPage {
    public TrendyolPage(){
        PageFactory.initElements(Driver.getAndroidDriver(), this);
    }
    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewCountryName\" and @text=\"Turkey\"]")
    private WebElement turkishFlagButton ;
}
