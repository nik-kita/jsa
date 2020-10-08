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
    //TODO
    public void subscribeStandard() {
        driver.findElement(PricingPlansLoginModeLocator.SUBSCRIBE_BTN_STANDARD_PLAN).click();
    }
    public void subscribePremium() {
        driver.findElement(PricingPlansLoginModeLocator.SUBSCRIBE_BTN_PREMIUM_PLAN).click();
    }
    public void clickBlocksButton() {
        driver.findElement(PricingPlansLoginModeLocator.BLOCKS_BUTTON).click();
    }
}
