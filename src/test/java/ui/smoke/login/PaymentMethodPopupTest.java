package ui.smoke.login;

import pageobjects.locators.OnixLocator;
import org.testng.asserts.SoftAssert;
import pageobjects.login.popups.PaymentMethodPopup;
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
        if(!driver.isElementPresent(locator)) {
            paymentMethodPopup.clickCardTab();
        }
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }
    @DataProvider
    public Object[] getPaymentMethodCardLocators() {
        return PaymentMethodPopup.Locator.values();
    }

    @Test(dataProvider = "getPaymentMethodPayPalLocators")
    public void paymentMethodPayPalTest(OnixLocator locator) {
        PaymentMethodPopup.PayPalIframe frame = paymentMethodPopup.switchToPayPalIframe();
        SoftAssert soft = new SoftAssert();
        new OnixAssert(driver).softCheckCountOfElementByLocator(locator, 1, soft);
        paymentMethodPopup = frame.clickCardTab();
    }
    @DataProvider
    public Object[] getPaymentMethodPayPalLocators() {
        return PaymentMethodPopup.PayPalIframeLocator.values();
    }
}
