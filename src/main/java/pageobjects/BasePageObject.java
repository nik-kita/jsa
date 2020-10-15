package pageobjects;

import engine.OnixWebDriver;
import pageobjects.locators.GeneralFooterLocator;

public abstract class BasePageObject implements GeneralFooterLocator {
    protected OnixWebDriver driver;

    public BasePageObject(OnixWebDriver driver) {
        this.driver = driver;
    }

    public abstract BasePageObject goMainPage();

    public abstract BasePageObject goPricingPage();

    public OnixWebDriver getDriver() {
        return driver;
    }
}
