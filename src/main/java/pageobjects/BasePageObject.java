package pageobjects;

import engine.OnixWebDriver;

public abstract class BasePageObject {
    protected OnixWebDriver driver;

    public BasePageObject(OnixWebDriver driver) {
        this.driver = driver;
    }

    public abstract BasePageObject goMainPage();

    public abstract BasePageObject goPricingPage();
}
