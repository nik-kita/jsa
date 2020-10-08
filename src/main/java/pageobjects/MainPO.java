package pageobjects;

import locators.GeneralHeaderLocator;
import engine.OnixWebDriver;
import locators.JoinNowPageLocator;
import locators.LoginPageLocator;
import locators.login_mode.GeneralHeaderLoginModeLocator;
import pageobjects.blog.BlogPO;
import pageobjects.login.HomeLoginModePO;
import popups.JsaCookies;

public class MainPO extends BaseLogoutModePageObject {
    public MainPO(OnixWebDriver driver) {
        super(driver);
        JsaCookies.acceptIfCookiesPresent(driver);
    }



}
