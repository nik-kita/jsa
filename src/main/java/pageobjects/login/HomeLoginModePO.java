package pageobjects.login;

import engine.OnixWebDriver;
import locators.login_mode.GeneralHeaderLoginModeLocator;
import locators.login_mode.HomeLoginModeLocator;
import pageobjects.MainPO;

public class HomeLoginModePO extends BaseLoginModePageObject {
    public HomeLoginModePO(OnixWebDriver driver) {
        super(driver);
    }

    public UserCabinetDropdownPO openUserDropDown() {
        driver.findElement(HomeLoginModeLocator.MY_CABINET_DROPDOWN).click();
        return new UserCabinetDropdownPO(driver);
    }

    public MainLoginModePO goMainPage() {
        driver.findElement(GeneralHeaderLoginModeLocator.JSA_LOGO).click();
        return new MainLoginModePO(driver);
    }
}
