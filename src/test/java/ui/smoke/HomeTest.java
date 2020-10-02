package ui.smoke;

import locators.GeneralFooterLocator;
import locators.GeneralHeaderLocator;
import locators.HomePageLocator;
import locators.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class HomeTest extends OnixTestRunner {

    @BeforeClass
    public void goHomePage() {
        welcome();
    }

    @Test(dataProvider = "getGeneralHeaderLocators")
    public void generalHeaderTest(OnixLocator locator) {
        welcome();
        new OnixAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getGeneralHeaderLocators() {
        return GeneralHeaderLocator.values();
    }

    @Test(dataProvider = "getHomePageLocators")
    public void homePageTest(OnixLocator locator) {
        new OnixAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getHomePageLocators() {
        return HomePageLocator.values();
    }

    @Test(dataProvider = "getGeneralFooterLocators")
    public void generalFooterTest(OnixLocator locator) {
        new OnixAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getGeneralFooterLocators() {
        return GeneralFooterLocator.values();
    }
}
