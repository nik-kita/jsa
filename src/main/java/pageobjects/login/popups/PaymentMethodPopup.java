package pageobjects.login.popups;

import engine.OnixWebDriver;
import locators.OnixLocator;
import org.openqa.selenium.By;
import pageobjects.login.PricingPlansLoginModePO;

public class PaymentMethodPopup {
    OnixWebDriver driver;
    String PAYPAL_IFRAME_NAME;

    public PaymentMethodPopup(OnixWebDriver driver) {
        this.driver = driver;
    }

    public PricingPlansLoginModePO exit() {
        driver.findElement(CardMethodLocator.EXIT_X_BUTTON).click();
        return new PricingPlansLoginModePO(driver);
    }

    public void clickPayWithCard() {
        if(!driver.isElementPresent(CardMethodLocator.PAY_WITH_CARD_BUTTON)) {
            clickCardTab();
        }
        driver.findElement(CardMethodLocator.PAY_WITH_CARD_BUTTON).click();
    }

    public PaymentMethodPopup clickPayPalTab() {
        driver.findElement(CardMethodLocator.PAY_PALL_TAB).click();
        PAYPAL_IFRAME_NAME = driver
                .getSeleniumDriver()
                .findElement(By.xpath("//iframe"))
                .getAttribute("name");
        return this;
    }
    public PaymentMethodPopup clickCardTab() {
        driver.findElement(CardMethodLocator.CARD_TAB).click();
        return this;
    }

    public void switchToPayPalIframe() {
        clickPayPalTab();
        System.out.println(PAYPAL_IFRAME_NAME);
        driver.getSeleniumDriver().switchTo().frame(PAYPAL_IFRAME_NAME);
    }
    public void switchBackFromIframe() {
        driver.getSeleniumDriver().switchTo().parentFrame();
    }

    public void clickPayPalButton() {
        switchToPayPalIframe();
        driver.findElement(PayPalIframeLocator.PAYPAL_BTN_IN_PAYPAL_IFRAME).click();
    }

    public void clickDebitOrCreditCard() {
        switchToPayPalIframe();
        driver.findElement(PayPalIframeLocator.DEBIT_OR_CREDIT_BTN_IN_PAYPAL_IFRAME).click();
    }


    public enum CardMethodLocator implements OnixLocator {
        EXIT_X_BUTTON(By.xpath("(//button/span[contains(text(), '×')])[1]")),
        PAY_PALL_TAB(By.id("nav-paypal-tab")),
        CARD_TAB(By.id("nav-card-tab")),
        PAY_WITH_CARD_BUTTON(By.xpath("//button[contains(text(), 'Pay with Card')]")),

        ;

        private By path;

        CardMethodLocator(By path) {
            this.path = path;
        }

    }
    public enum PayPalIframeLocator implements OnixLocator {
        PAYPAL_BTN_IN_PAYPAL_IFRAME(By.xpath("//div[@class='paypal-button-label-container']//img[@aria-label='PayPal']")),
        DEBIT_OR_CREDIT_BTN_IN_PAYPAL_IFRAME(By.xpath("//*[@class='paypal-button-label-container']//span[contains(text(), 'Debit or Credit')]")),

        ;

        private By path;

        PayPalIframeLocator(By path) {
            this.path = path;
        }

    }

}
