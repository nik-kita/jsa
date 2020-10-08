package pageobjects;

import locators.GeneralHeaderLocator;
import engine.OnixWebDriver;
import popups.JsaCookies;

public abstract class BasePageObject {
    protected OnixWebDriver driver;

    public BasePageObject(OnixWebDriver driver) {
        this.driver = driver;
    }

    public abstract BasePageObject goMainPage();
}
