package ui.smoke.login;

import locators.GeneralFooterLocator;
import locators.OnixLocator;
import locators.login_mode.GeneralHeaderLoginModeLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.MainPO;
import ui.OnixAssert;

public class MainLoginModeTest extends JsaLoginBaseTestRunner {
    @BeforeClass
    public void goMain() {
        homeLoginModePO.goMainPage();
    }

    @Test(dataProvider = "getGeneralHeaderLoginModeLocators")
    public void generalHeaderLoginModeTest(OnixLocator locator) {
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }
    @DataProvider
    public Object[] getGeneralHeaderLoginModeLocators() {
        return GeneralHeaderLoginModeLocator.values();
    }

    @Test(dataProvider = "getMainPageLocators")
    public void checkMainPageSameAsLogout(OnixLocator locator) {
        new OnixAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getMainPageLocators() {
        return MainPO.Locator.values();
    }

    @Test(dataProvider = "getGeneralFooterLocators")
    public void checkGeneralFooterSameAsLogoutTest(OnixLocator locator) {
        new OnixAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getGeneralFooterLocators() {
        return GeneralFooterLocator.values();
    }

}
