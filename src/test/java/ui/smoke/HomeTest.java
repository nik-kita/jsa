package ui.smoke;

import locators.HomeLocator;
import locators.Locator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.JsaAssert;
import ui.JsaTestRunner;

public class HomeTest extends JsaTestRunner {

    @Test(testName = "Smoke test unique elements on Home page", dataProvider = "getHomeLocators")
    public void homePageUniqueElements(Locator locator) {
        new JsaAssert(getDriver()).isElementPresentAndUnique(locator);
    }

    @DataProvider
    public Object[] getHomeLocators() {
        return HomeLocator.values();
    }
}
