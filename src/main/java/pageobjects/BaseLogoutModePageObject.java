package pageobjects;

import engine.OnixWebDriver;
import locators.GeneralHeaderLocator;

public class BaseLogoutModePageObject extends BasePageObject {
    public BaseLogoutModePageObject(OnixWebDriver driver) {
        super(driver);
    }

    @Override
    public BasePageObject goHome() {
        driver.findElement(GeneralHeaderLocator.JSA_LOGO).click();
        return new MainPO(driver);
    }
}
