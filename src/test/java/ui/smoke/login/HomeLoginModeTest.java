package ui.smoke.login;

import pageobjects.general_parts.OnixLocator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.login.HomeLoginModePO;
import pageobjects.login.UserCabinetDropdownPO;
import ui.OnixAssert;

public class HomeLoginModeTest extends JsaLoginBaseTestRunner {



    @Test(dataProvider = "getHomeLoginModeLocators")
    public void homeLoginModeTest(OnixLocator locator) {
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getHomeLoginModeLocators() {
        return HomeLoginModePO.Locator.values();
    }

    @Test(dataProvider = "getUserCabinetDropdownLocators")
    public void userCabinetDropdownTest(OnixLocator locator) {
        homeLoginModePO.openUserDropDown();
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUserCabinetDropdownLocators() {
        return UserCabinetDropdownPO.Locator.values();
    }

}
