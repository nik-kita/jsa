package pageobjects.login;

import engine.OnixWebDriver;
import locators.OnixLocator;
import org.openqa.selenium.By;

public class PricingLoginModePO extends BaseLoginModePageObject {
    public PricingLoginModePO(OnixWebDriver driver) {
        super(driver);
    }

    public PricingPlansLoginModePO goPricingPlans() {
        driver.findElement(Locator.GET_STARTED_LEFT).click();
        return new PricingPlansLoginModePO(driver);
    }


    public enum Locator implements OnixLocator {
        SUBSCRIPTIONS_BUTTON(By.xpath("//*[contains(text(), 'Subscriptions')]")),
        BLOCKS_BUTTON(By.xpath("//*[contains(text(), 'Blocks')]")),
        GET_STARTED_LEFT(By.xpath("//div[@class='price_block']//div[contains(text(), 'Standard Plan')]/../..//a")),

        ;

        private By path;

        Locator(By path) {
            this.path = path;
        }

    }
}
