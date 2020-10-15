package ui.smoke;

import pageobjects.locators.GeneralFooterLocator;
import pageobjects.locators.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.MainPO;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class MainPageTest extends OnixTestRunner {

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
        return MainPO.HeaderLocator.values();
    }

    @Test(dataProvider = "getMainPageLocators")
    public void mainPageTest(OnixLocator locator) {
        new OnixAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getMainPageLocators() {
        return MainPO.Locator.values();
    }

    @Test(dataProvider = "getGeneralFooterLocators")
    public void generalFooterTest(OnixLocator locator) {
        new OnixAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getGeneralFooterLocators() {
        return GeneralFooterLocator.FooterLocator.values();
    }
}
