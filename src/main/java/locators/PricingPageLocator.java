package locators;

import org.openqa.selenium.By;

public enum PricingPageLocator implements OnixLocator {
    GET_STARTED_LEFT(By.xpath("//div[@class='price_block']//div[contains(text(), 'Standard Plan')]/../..//a")),
    //TODO there are absolute same 2 links GET_STARTED_RIGHT(By.xpath("//div[@class='price_block']//div[contains(text(), 'Premium Plan')]/../..//a")),
    SUBSCRIPTIONS_BUTTON(By.xpath("//*[contains(text(), 'Subscriptions')]")),
    BLOCKS_BUTTON(By.xpath("//*[contains(text(), 'Blocks')]")),

    ;

    private By path;

    PricingPageLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
