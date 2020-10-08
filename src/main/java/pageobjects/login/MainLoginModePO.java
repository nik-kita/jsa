package pageobjects.login;

import engine.OnixWebDriver;
import locators.login_mode.GeneralHeaderLoginModeLocator;

public class MainLoginModePO extends BaseLoginModePageObject {
    public MainLoginModePO(OnixWebDriver driver) {
        super(driver);
    }

    public HomeLoginModePO goHome() {
        driver.findElement(GeneralHeaderLoginModeLocator.TO_USER_HOME_CORNER_LINK).click();
        return new HomeLoginModePO(driver);
    }
}
