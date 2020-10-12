package pageobjects;

import engine.OnixWebDriver;
import locators.OnixLocator;
import org.openqa.selenium.By;

public class MyBookPO extends BaseLogoutModePageObject {
    public MyBookPO(OnixWebDriver driver) {
        super(driver);
    }



    public enum Locator implements OnixLocator {
        ORDER_NOW_BUTTON(By.cssSelector(".book-banner__order-btn")),
        AMAZON_UNITED_KINGDOM_LINK(By.
                xpath("//div[contains(text(), 'Kingdom')]/following-sibling::div//a[contains(@href, 'amazon')]")),
        WHSMITHS_UNITED_KINGDOM_LINK(By.
                xpath("//div[contains(text(), 'Kingdom')]/following-sibling::div//a[contains(@href, 'whsmith')]")),
        APPLE_UNITED_KINGDOM_LINK(By.
                xpath("//div[contains(text(), 'Kingdom')]/following-sibling::div//a[contains(@href, 'apple')]")),
        WATERSTONES_UNITED_KINGDOM_LINK(By.
                xpath("//div[contains(text(), 'Kingdom')]/following-sibling::div//a[contains(@href, 'waterstones')]")),
        AUDIBLE_UNITED_KINGDOM_LINK(By.
                xpath("//div[contains(text(), 'Kingdom')]/following-sibling::div//a[contains(@href, 'audible')]")),
        BOOKTOPIA_AUSTRALIA_LINK(By.
                xpath("//div[contains(text(), 'Australia')]/following-sibling::div//a[contains(@href, 'booktopia')]")),
        DYMOCKS_AUSTRALIA_LINK(By.
                xpath("//div[contains(text(), 'Australia')]/following-sibling::div//a[contains(@href, 'dymocks')]")),
        AMAZON_AUSTRALIA_LINK(By.
                xpath("//div[contains(text(), 'Australia')]/following-sibling::div//a[contains(@href, 'amazon')]")),
        AUDIBLE_AUSTRALIA_LINK(By.
                xpath("//div[contains(text(), 'Australia')]/following-sibling::div//a[contains(@href, 'audible')]")),
        APPLE_EBOOK_AUSTRALIA_LINK(By.
                xpath("//div[contains(text(), 'Australia')]/following-sibling::div//a[contains(@href, 'apple.com/au/b')]")),
        APPLE_AUDIO_AUSTRALIA_LINK(By.
                xpath("//div[contains(text(), 'Australia')]/following-sibling::div//a[contains(@href, 'apple.com/au/a')]")),
        AMAZON_USA_LINK(By.
                xpath("//div[contains(text(), 'USA')]/following-sibling::div//div[contains(text(), 'zon')]")),
        AUDIBLE_USA_LINK(By.
                xpath("//div[contains(text(), 'USA')]/following-sibling::div//div[contains(text(), 'book')]")),
        MIGHTY_APE_ZEALAND_LIND(By.
                xpath("//div[contains(text(), 'Zealand')]/following-sibling::div//a[contains(@href, 'ape')]")),
        EASON_IRELAND_LINK(By.xpath("//div[contains(text(), 'Ireland')]/following-sibling::div//a[contains(@href, 'easons')]"))

        ;

        private By path;

        Locator(By path) {
            this.path = path;
        }

    }

}

