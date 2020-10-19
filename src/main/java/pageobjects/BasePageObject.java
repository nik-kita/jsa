package pageobjects;

import engine.OnixWebDriver;
import pageobjects.general_parts.GeneralFooter;

public abstract class BasePageObject implements GeneralFooter {
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
