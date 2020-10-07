package pageobjects.login;

import engine.OnixWebDriver;
import locators.login_mode.GeneralHeaderLoginModeLocator;
import pageobjects.BasePageObject;

public class HomeLoginModePO extends BaseLoginModePageObject {
    public HomeLoginModePO(OnixWebDriver driver) {
        super(driver);
    }

    public UserCabinetDropdown openUserDropDown() {
        driver.findElement(GeneralHeaderLoginModeLocator.MY_CABINET_DROPDOWN).click();
        return new UserCabinetDropdown(driver);
    }
}
