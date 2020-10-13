package ui.smoke;

import locators.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.LoginPO;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class LoginPageTest extends OnixTestRunner {
    @BeforeClass
    public void goLoginPage() {
        welcome().goLoginPage();
    }

    @Test(dataProvider = "getLoginPageLocators")
    public void loginPageTest(OnixLocator locator) {
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getLoginPageLocators() {
        return LoginPO.Locator.values();
    }
}
