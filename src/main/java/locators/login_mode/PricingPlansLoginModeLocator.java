package locators.login_mode;

import locators.OnixLocator;
import org.openqa.selenium.By;

public enum PricingPlansLoginModeLocator implements OnixLocator {
    JSA_LOGO(By.cssSelector("a[href='/'] img")),
    HOME_HEADER_BUTTON(By.cssSelector(".nav [href='/users/']")),
    ACCOUNT_HEADER_BUTTON(By.cssSelector(".nav [href='/users/account/']")),
    PRICING_PLANS_HEADER_BUTTON(By.cssSelector(".nav [href='/users/pricing/']")),
    LOGOUT_BUTTON(By.cssSelector(".login [href='/accounts/logout']")),
    SUBSCRIPTIONS_BUTTON(By.xpath("//*[contains(text(), 'Subscriptions')]")),
    BLOCKS_BUTTON(By.xpath("//*[contains(text(), 'Blocks')]")),
    SUBSCRIBE_BTN_STANDARD_PLAN(By.id("standardSubscriptionButton")),
    SUBSCRIBE_BTN_PREMIUM_PLAN(By.id("premiumSubscriptionButton")),

    ;

    private By path;

    PricingPlansLoginModeLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
