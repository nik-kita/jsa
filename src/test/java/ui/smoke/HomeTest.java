package ui.smoke;

import locators.GeneralFooterLocator;
import locators.GeneralHeaderLocator;
import locators.HomePageLocator;
import locators.Locator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.JsaAssert;
import ui.JsaTestRunner;

public class HomeTest extends JsaTestRunner {

    @BeforeClass
    public void goHomePage() {
        welcome();
    }

    @Test(dataProvider = "getGeneralHeaderLocators")
    public void generalHeaderTest(Locator locator) {
        welcome();
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

    @Test(dataProvider = "getGeneralFooterLocators")
    public void generalFooterTest(Locator locator) {
        new JsaAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getGeneralFooterLocators() {
        return GeneralFooterLocator.values();
    }
}
