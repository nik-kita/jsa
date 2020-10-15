package business_logic.login;

import engine.OnixWebDriver;
import pageobjects.login.PricingPlansLoginModePO;
import pageobjects.login.popups.PaymentMethodPopup;

public class PricingPlans implements LoginMode {
    PricingPlansLoginModePO pricingPlansLoginModePO;

    public PricingPlans(PricingPlansLoginModePO pricingPlansLoginModePO) {
        this.pricingPlansLoginModePO = pricingPlansLoginModePO;
    }

    public PaymentMethod subscribeStandard() {
        PaymentMethodPopup paymentMethodPopup = pricingPlansLoginModePO.subscribeStandard();
        return new PaymentMethod(paymentMethodPopup);
    }

    public PaymentMethod subscribePremium() {
        PaymentMethodPopup paymentMethodPopup = pricingPlansLoginModePO.subscribePremium();
        return new PaymentMethod(paymentMethodPopup);
    }

    public PaymentMethod buyNowPremium() {
        PaymentMethodPopup paymentMethodPopup = pricingPlansLoginModePO.buyNow();
        return new PaymentMethod(paymentMethodPopup);
    }

    public MainUser goMain() {
        return new MainUser(pricingPlansLoginModePO.goMainPage());
    }

    @Override
    public OnixWebDriver getDriver() {
        return pricingPlansLoginModePO.getDriver();
    }
}
