package pageobjects.login;

import engine.OnixWebDriver;
import locators.login_mode.PricingPlansLoginModeLocator;

public class PricingPlansLoginModePO extends BaseLoginModePageObject {
    public PricingPlansLoginModePO(OnixWebDriver driver) {
        super(driver);
    }

    public HomeLoginModePO goHome() {
        driver.findElement(PricingPlansLoginModeLocator.HOME_HEADER_BUTTON).click();
        return new HomeLoginModePO(driver);
    }
}
