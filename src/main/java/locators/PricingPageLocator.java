package locators;

import org.openqa.selenium.By;

public enum PricingPageLocator implements OnixLocator {
    SUBSCRIPTIONS_OR_BLOCK_SWITCHER(By.cssSelector(".tabs_caption .active")),
    GET_STARTED_LINKS(By.cssSelector("[href='/users/register/']")),


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
