package pageobjects.login;

import engine.OnixWebDriver;
import pageobjects.BasePageObject;
import pageobjects.general_parts.login_mode.GeneralHeaderLoginModeLocator;

public class BaseLoginModePageObject extends BasePageObject implements GeneralHeaderLoginModeLocator {
    public BaseLoginModePageObject(OnixWebDriver driver) {
        super(driver);
    }

    @Override
    public MainLoginModePO goMainPage() {
        driver.findElement(HomeLoginModePO.Locator.JSA_LOGO).click();
        return new MainLoginModePO(driver);
    }

    @Override
    public PricingLoginModePO goPricingPage() {
        driver.findElement(HeaderLocator.PRICING_HEADER_BUTTON).click();
        return new PricingLoginModePO(driver);
    }


}
