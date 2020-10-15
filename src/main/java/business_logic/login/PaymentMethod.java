package business_logic.login;

import engine.OnixWebDriver;
import pageobjects.login.PricingPlansLoginModePO;
import pageobjects.login.popups.PaymentMethodPopup;

public class PaymentMethod implements LoginMode {
    PaymentMethodPopup paymentMethodPopup;

    public PaymentMethod(PaymentMethodPopup paymentMethodPopup) {
        this.paymentMethodPopup = paymentMethodPopup;
    }

    public PricingPlans close() {
        return new PricingPlans(paymentMethodPopup.exit());
    }


    @Override
    public OnixWebDriver getDriver() {
        return paymentMethodPopup.driver;
    }


}
