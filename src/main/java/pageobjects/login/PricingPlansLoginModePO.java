package pageobjects.login;

import engine.OnixWebDriver;
import locators.login_mode.PricingPlansLoginModeLocator;
import pageobjects.login.popups.PaymentMethodPopup;

public class PricingPlansLoginModePO extends BaseLoginModePageObject {
    public PricingPlansLoginModePO(OnixWebDriver driver) {
        super(driver);
    }

    public HomeLoginModePO goHome() {
        driver.findElement(PricingPlansLoginModeLocator.HOME_HEADER_BUTTON).click();
        return new HomeLoginModePO(driver);
    }

    public PaymentMethodPopup subscribeStandard() {
        driver.findElement(PricingPlansLoginModeLocator.SUBSCRIBE_BTN_STANDARD_PLAN).click();
        return new PaymentMethodPopup(driver);
    }
    public PaymentMethodPopup subscribePremium() {
        driver.findElement(PricingPlansLoginModeLocator.SUBSCRIBE_BTN_PREMIUM_PLAN).click();
        return new PaymentMethodPopup(driver);
    }
    public PricingPlansLoginModePO clickBlocksButton() {
        driver.findElement(PricingPlansLoginModeLocator.BLOCKS_BUTTON).click();
        return this;
    }
}
