package ui.smoke.login;

import locators.OnixLocator;
import locators.login_mode.GeneralHeaderLoginModeLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.login.HomeLoginModePO;
import pageobjects.login.UserCabinetDropdown;
import ui.OnixAssert;

public class HomeLoginModeTest extends JsaLoginBaseTestRunner {
    HomeLoginModePO homeLoginModePO;

    @BeforeClass
    public void loginWelcome() {
        welcome();
        homeLoginModePO = login();
    }

    @Test(dataProvider = "getGeneralHeaderLoginLocators")
    public void generalHeaderLoginModeTest(OnixLocator locator) {
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getGeneralHeaderLoginLocators() {
        return GeneralHeaderLoginModeLocator.values();
    }

    @Test(dataProvider = "getUserCabinetDropdownLocators")
    public void userCabinetDropdownTest(OnixLocator locator) {
        homeLoginModePO.openUserDropDown();
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getUserCabinetDropdownLocators() {
        return GeneralHeaderLoginModeLocator.UserCabinetLocator.values();
    }


}
