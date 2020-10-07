package pageobjects.login;

import engine.OnixWebDriver;
import locators.login_mode.GeneralHeaderLoginModeLocator;

public class HomeLoginModePO extends BaseLoginModePageObject {
    public HomeLoginModePO(OnixWebDriver driver) {
        super(driver);
    }

    public UserCabinetDropdownPO openUserDropDown() {
        driver.findElement(GeneralHeaderLoginModeLocator.MY_CABINET_DROPDOWN).click();
        return new UserCabinetDropdownPO(driver);
    }
}
