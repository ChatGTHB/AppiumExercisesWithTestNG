package day05;

import io.appium.java_client.android.AndroidTouchAction;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ApiDemosPage;
import utils.Hooks;
import utils.ReusableMethods;

import static io.appium.java_client.touch.offset.PointOption.point;


public class C06_ApiDemosTest extends Hooks {

    ApiDemosPage apiDemosPage = new ApiDemosPage();
    ReusableMethods reusableMethods = new ReusableMethods();
    public AndroidTouchAction action;

    @Test
    public void clickAccessibilityButton(){
        apiDemosPage.clickElement(apiDemosPage.getAccessibilityButton());
    }

    @Test
    public void tabOntheWithTouchAction(){
      action = new AndroidTouchAction(androidDriver);
      action.tap(point(95, 734)).perform();
    }

    @Test
    public void tabWithMethod(){
        reusableMethods.tabOnThePoints(95,734);
    }

    @Test
    public void scrollTest(){
        apiDemosPage.clickElement(apiDemosPage.getViewsButton());
        action = new AndroidTouchAction(androidDriver);
        action.longPress(point(471, 1940))
                .moveTo(point(457, 1065)).release()
                .perform();
    }

    @Test
    public void scrollTestwithMethod(){
        apiDemosPage.clickElement(apiDemosPage.getViewsButton());
        reusableMethods.scroll(471,1940,457,1065);
        Assert.assertTrue(apiDemosPage.getListsButton().isDisplayed());
    }
}
