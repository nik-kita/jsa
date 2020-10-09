package ui.smoke.login;

import locators.OnixLocator;
import locators.login_mode.popups.PaymentMethodPopup;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.OnixAssert;

public class PaymentMethodPopupTest extends JsaLoginBaseTestRunner {
    PaymentMethodPopup paymentMethodPopup;
    @BeforeClass
    public void openPopup() {
        paymentMethodPopup = homeLoginModePO
                .goMainPage()
                .goPricingPage()
                .goPricingPlans()
                .subscribePremium();
    }

    @Test(dataProvider = "getPaymentMethodCardLocators")
    public void paymentMethodCardTest(OnixLocator locator) {
        if(!driver.isPresent(locator)) {
            paymentMethodPopup.clickCardTab();
        }
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }
    @DataProvider
    public Object[] getPaymentMethodCardLocators() {
        return new Object[]{
                PaymentMethodPopup.CardMethodLocator.CARD_TAB,
                PaymentMethodPopup.CardMethodLocator.PAY_PALL_TAB,
                PaymentMethodPopup.CardMethodLocator.EXIT_X_BUTTON,
                PaymentMethodPopup.CardMethodLocator.PAY_WITH_CARD_BUTTON
        };
    }

    @Test(dataProvider = "getPaymentMethodPayPalLocators")
    public void paymentMethodPayPalTest(OnixLocator locator) {
        paymentMethodPopup.switchToPayPalIframe();
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
        paymentMethodPopup.switchBackFromIframe();
    }
    @DataProvider
    public Object[] getPaymentMethodPayPalLocators() {
        return new Object[]{
                PaymentMethodPopup.CardMethodLocator.PAYPAL_BTN_IN_PAYPAL_IFRAME,
                PaymentMethodPopup.CardMethodLocator.DEBIT_OR_CREDIT_BTN_IN_PAYPAL_IFRAME,
        };
    }
}
