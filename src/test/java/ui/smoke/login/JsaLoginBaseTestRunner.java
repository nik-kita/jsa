package ui.smoke.login;

import pageobjects.login.HomeLoginModePO;
import shortcuts.RouteHacks;
import ui.OnixTestRunner;

public class JsaLoginBaseTestRunner extends OnixTestRunner {

    public HomeLoginModePO login() {
        return new RouteHacks(driver).login();
    }
}
