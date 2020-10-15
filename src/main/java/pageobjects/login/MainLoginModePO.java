package pageobjects.login;

import engine.OnixWebDriver;

public class MainLoginModePO extends BaseLoginModePageObject {
    public MainLoginModePO(OnixWebDriver driver) {
        super(driver);
    }

    public HomeLoginModePO goHome() {
        driver.findElement(HeaderLocator.TO_USER_HOME_CORNER_LINK).click();
        return new HomeLoginModePO(driver);
    }

}
