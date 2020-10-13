package pageobjects.login;

import engine.OnixWebDriver;
import locators.OnixLocator;
import org.openqa.selenium.By;
import pageobjects.login.popups.PaymentMethodPopup;

public class PricingPlansLoginModePO extends BaseLoginModePageObject {
    public PricingPlansLoginModePO(OnixWebDriver driver) {
        super(driver);
    }

    public HomeLoginModePO goHome() {
        driver.findElement(Locator.HOME_HEADER_BUTTON).click();
        return new HomeLoginModePO(driver);
    }

    public PaymentMethodPopup subscribeStandard() {
        driver.findElement(Locator.SUBSCRIBE_BTN_STANDARD_PLAN).click();
        return new PaymentMethodPopup(driver);
    }
    public PaymentMethodPopup subscribePremium() {
        driver.findElement(Locator.SUBSCRIBE_BTN_PREMIUM_PLAN).click();
        return new PaymentMethodPopup(driver);
    }
    public PricingPlansLoginModePO clickBlocksButton() {
        driver.findElement(Locator.BLOCKS_BUTTON).click();
        return this;
    }


    public enum Locator implements OnixLocator {
        JSA_LOGO(By.cssSelector("a[href='/'] img")),
        HOME_HEADER_BUTTON(By.cssSelector(".nav [href='/users/']")),
        ACCOUNT_HEADER_BUTTON(By.cssSelector(".nav [href='/users/account/']")),
        PRICING_PLANS_HEADER_BUTTON(By.cssSelector(".nav [href='/users/pricing/']")),
        LOGOUT_BUTTON(By.cssSelector(".login[href='/accounts/logout']")),
        SUBSCRIPTIONS_BUTTON(By.xpath("//*[contains(text(), 'Subscriptions')]")),
        BLOCKS_BUTTON(By.xpath("//*[contains(text(), 'Blocks')]")),
        SUBSCRIBE_BTN_STANDARD_PLAN(By.id("standardSubscriptionButton")),
        SUBSCRIBE_BTN_PREMIUM_PLAN(By.id("premiumSubscriptionButton")),

        ;

        private By path;

        Locator(By path) {
            this.path = path;
        }
        @Override
        public By getPath() {
            return path;
        }

    }
}
