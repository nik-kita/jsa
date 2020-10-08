package pageobjects.login;

import engine.OnixWebDriver;
import locators.login_mode.PricingLoginModeLocator;
import locators.login_mode.PricingPlansLoginModeLocator;

public class PricingLoginModePO extends BaseLoginModePageObject {
    public PricingLoginModePO(OnixWebDriver driver) {
        super(driver);
    }

    public PricingPlansLoginModePO goPricingPlans() {
        driver.findElement(PricingLoginModeLocator.GET_STARTED_LEFT).click();
        return new PricingPlansLoginModePO(driver);
    }
}
