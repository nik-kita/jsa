package pageobjects.login;

import engine.OnixWebDriver;
import locators.login_mode.PricingPlansLoginModeLocator;

public class PricingLoginModePO extends BaseLoginModePageObject {
    public PricingLoginModePO(OnixWebDriver driver) {
        super(driver);
    }

    public PricingPlansLoginModePO goPricingPlans() {
        driver.findElement(PricingPlansLoginModeLocator.SUBSCRIBE_BTN_PREMIUM_PLAN).click();
        return new PricingPlansLoginModePO(driver);
    }
}
