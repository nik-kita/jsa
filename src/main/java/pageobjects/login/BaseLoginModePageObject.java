package pageobjects.login;

import engine.OnixWebDriver;
import locators.login_mode.GeneralHeaderLoginModeLocator;
import pageobjects.BasePageObject;

public class BaseLoginModePageObject extends BasePageObject {
    public BaseLoginModePageObject(OnixWebDriver driver) {
        super(driver);
    }

    @Override
    public BasePageObject goHome() {
        driver.findElement(GeneralHeaderLoginModeLocator.JSA_LOGO).click();
        return new HomeLoginModePO(driver);
    }
}
