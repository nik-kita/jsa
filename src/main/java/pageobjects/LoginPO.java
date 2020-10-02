package pageobjects;

import engine.OnixWebDriver;
import locators.LoginPageLocator;

public class LoginPO {
    OnixWebDriver driver;
    public LoginPO(OnixWebDriver driver) {
        this.driver = driver;
    }

    public HomePO goHomePage() {
        driver.findElement(LoginPageLocator.JSA_LOGO).click();
        return new HomePO(driver);
    }
}
