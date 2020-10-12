package pageobjects.login;

import engine.OnixWebDriver;
import locators.login_mode.GeneralHeaderLoginModeLocator;
import pageobjects.BasePageObject;

public class BaseLoginModePageObject extends BasePageObject {
    public BaseLoginModePageObject(OnixWebDriver driver) {
        super(driver);
    }

    @Override
    public BasePageObject goMainPage() {
        driver.findElement(HomeLoginModePO.Locator.JSA_LOGO).click();
        return new HomeLoginModePO(driver);
    }

    @Override
    public PricingLoginModePO goPricingPage() {
        driver.findElement(GeneralHeaderLoginModeLocator.PRICING_HEADER_BUTTON).click();
        return new PricingLoginModePO(driver);
    }


}
