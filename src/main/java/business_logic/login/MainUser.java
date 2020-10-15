package business_logic.login;

import business_logic.MainGuest;
import engine.OnixWebDriver;
import pageobjects.MainPO;
import pageobjects.login.MainLoginModePO;
import pageobjects.login.PricingLoginModePO;

public class MainUser implements LoginMode {
    MainLoginModePO mainLoginModePO;

    public MainUser(MainLoginModePO mainLoginModePO) {
        this.mainLoginModePO = mainLoginModePO;
    }

    public static MainUser quickGet(LoginMode po) {
        OnixWebDriver driver = po.getDriver();
        driver.get(baseUrl);
        return new MainUser(new MainLoginModePO(driver));
    }

    public PricingUser goPricing() {
        PricingLoginModePO pricingLoginModePO = mainLoginModePO.goPricingPage();
        return new PricingUser(pricingLoginModePO);
    }

    public MainGuest logout() {
        MainPO mainPO = mainLoginModePO.goHome()
                .openUserDropDown()
                .logout();
        return new MainGuest(mainPO);
    }

    @Override
    public OnixWebDriver getDriver() {
        return mainLoginModePO.getDriver();
    }
}
