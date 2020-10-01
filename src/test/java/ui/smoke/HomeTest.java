package ui.smoke;

import locators.GeneralHeaderLocator;
import locators.HomePageLocator;
import locators.Locator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.JsaAssert;
import ui.JsaTestRunner;

public class HomeTest extends JsaTestRunner {

    @Test(dataProvider = "getGeneralHeaderLocators")
    public void generalHeaderTest(Locator locator) {
        new JsaAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getGeneralHeaderLocators() {
        return GeneralHeaderLocator.values();
    }

    @Test(dataProvider = "getHomePageLocators")
    public void homePageTest(Locator locator) {
        new JsaAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getHomePageLocators() {
        return HomePageLocator.values();
    }
}
