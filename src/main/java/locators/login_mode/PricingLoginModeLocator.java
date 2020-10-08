package locators.login_mode;

import locators.OnixLocator;
import org.openqa.selenium.By;

;

public enum PricingLoginModeLocator implements OnixLocator {
    SUBSCRIPTIONS_BUTTON(By.xpath("//*[contains(text(), 'Subscriptions')]")),
    BLOCKS_BUTTON(By.xpath("//*[contains(text(), 'Blocks')]")),
    GET_STARTED_LEFT(By.xpath("//div[@class='price_block']//div[contains(text(), 'Standard Plan')]/../..//a")),

    ;

    private By path;

    PricingLoginModeLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}

