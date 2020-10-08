package pageobjects.login;

import engine.OnixWebDriver;
import locators.MainPageLocator;
import locators.login_mode.GeneralHeaderLoginModeLocator;
import locators.login_mode.HomeLoginModeLocator;
import pageobjects.BasePageObject;

public class BaseLoginModePageObject extends BasePageObject {
    public BaseLoginModePageObject(OnixWebDriver driver) {
        super(driver);
    }

    @Override
    public BasePageObject goMainPage() {
        driver.findElement(HomeLoginModeLocator.JSA_LOGO).click();
        return new HomeLoginModePO(driver);
    }

    @Override
    public BasePageObject goPricingPage() {
        driver.findElement(GeneralHeaderLoginModeLocator.PRICING_HEADER_BUTTON).click();
        return new PricingLoginModePO(driver);
    }


}
