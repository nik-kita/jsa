package business_logic.login;

import pageobjects.login.PricingLoginModePO;

public class PricingUser implements LoginMode {
    PricingLoginModePO pricingLoginModePO;
    public PricingUser(PricingLoginModePO pricingLoginModePO) {
        this.pricingLoginModePO = pricingLoginModePO;
    }

    public static PricingUser getQuick(LoginMode po) {

    }
}
