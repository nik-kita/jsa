package ui.smoke.login;

import locators.GeneralFooterLocator;
import locators.OnixLocator;
import locators.login_mode.GeneralHeaderLoginModeLocator;
import locators.login_mode.HomeLoginModeLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.MainPO;
import pageobjects.login.HomeLoginModePO;
import ui.OnixAssert;

public class HomeLoginModeTest extends JsaLoginBaseTestRunner {



    @Test(dataProvider = "getHomeLoginModeLocators")
    public void homeLoginModeTest(OnixLocator locator) {
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getHomeLoginModeLocators() {
        return HomeLoginModeLocator.values();
    }

    @Test(dataProvider = "getUserCabinetDropdownLocators")
    public void userCabinetDropdownTest(OnixLocator locator) {
        homeLoginModePO.openUserDropDown();
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUserCabinetDropdownLocators() {
        return HomeLoginModeLocator.UserCabinetLocator.values();
    }

}
