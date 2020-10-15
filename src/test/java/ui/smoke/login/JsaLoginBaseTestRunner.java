package ui.smoke.login;

import org.testng.annotations.BeforeClass;
import pageobjects.login.HomeLoginModePO;
import shortcuts.RouteHacks;
import ui.OnixTestRunner;

public class JsaLoginBaseTestRunner extends OnixTestRunner {
    HomeLoginModePO homeLoginModePO;

    @BeforeClass
    public void loginWelcome() {
        openSite();
        homeLoginModePO = new RouteHacks(driver).login();
    }
}
