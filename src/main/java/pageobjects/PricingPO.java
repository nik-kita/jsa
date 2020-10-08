package pageobjects;

import engine.OnixWebDriver;
import locators.PricingPageLocator;
import locators.login_mode.PricingLoginModeLocator;
import locators.login_mode.PricingPlansLoginModeLocator;
import pageobjects.login.PricingPlansLoginModePO;

public class PricingPO extends BaseLogoutModePageObject {

    public PricingPO(OnixWebDriver driver) {
        super(driver);
    }

}
