package ui.functionality;

import data.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.login.HomeLoginModePO;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class LoginTest extends OnixTestRunner {

    @Test
    public void loginWithFBTest() {
        openSite().goLoginPage().loginByFB(User.getValidUser());
        new OnixAssert(driver).checkCountOfElementByLocator(HomeLoginModePO.Locator.HOME, 1);
    }
}
