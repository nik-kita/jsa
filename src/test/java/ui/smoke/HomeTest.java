package ui.smoke;

import locators.GeneralHeaderLocator;
import locators.Locator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.JsaAssert;
import ui.JsaTestRunner;

public class HomeTest extends JsaTestRunner {

    @Test(dataProvider = "getHomeLocators")
    public void generalHeaderTest(Locator locator) {
        new JsaAssert(getDriver()).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getHomeLocators() {
        return GeneralHeaderLocator.values();
    }
}
