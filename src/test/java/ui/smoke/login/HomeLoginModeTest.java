package ui.smoke.login;

import locators.OnixLocator;
import locators.login_mode.GeneralHeaderLoginModeLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.OnixAssert;

public class HomeLoginModeTest extends JsaLoginBaseTestRunner {

    @BeforeClass
    public void loginWelcome() {
        welcome();
        login();
    }

    @Test(dataProvider = "getGeneralHeaderLoginLocators")
    public void generalHeaderLoginModeTest(OnixLocator locator) {
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getGeneralHeaderLoginLocators() {
        return GeneralHeaderLoginModeLocator.values();
    }
}
