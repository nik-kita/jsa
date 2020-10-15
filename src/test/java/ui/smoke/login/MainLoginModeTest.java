package ui.smoke.login;

import pageobjects.locators.GeneralFooterLocator;
import pageobjects.locators.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.MainPO;
import pageobjects.login.MainLoginModePO;
import ui.OnixAssert;

public class MainLoginModeTest extends JsaLoginBaseTestRunner {
    MainLoginModePO mainLoginModePO;
    @BeforeClass
    public void goMain() {
        mainLoginModePO = homeLoginModePO.goMainPage();
    }

    @Test(dataProvider = "getGeneralHeaderLoginModeLocators")
    public void generalHeaderLoginModeTest(OnixLocator locator) {
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }
    @DataProvider
    public Object[] getGeneralHeaderLoginModeLocators() {
        return MainLoginModePO.HeaderLocator.values();
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
        return GeneralFooterLocator.FooterLocator.values();
    }

}
