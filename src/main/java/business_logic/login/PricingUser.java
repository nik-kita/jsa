package business_logic.login;

import engine.OnixWebDriver;
import pageobjects.login.PricingLoginModePO;

public class PricingUser implements LoginMode {
    PricingLoginModePO pricingLoginModePO;
    static String endPoint = "pricing/";

    public PricingUser(PricingLoginModePO pricingLoginModePO) {
        this.pricingLoginModePO = pricingLoginModePO;
    }

    public static PricingUser quickGet(LoginMode po) {
        OnixWebDriver driver = po.getDriver();
        driver.get(baseUrl + endPoint);
        return new PricingUser(new PricingLoginModePO(po.getDriver()));
    }

    @Override
    public OnixWebDriver getDriver() {
        return pricingLoginModePO.getDriver();
    }
}
