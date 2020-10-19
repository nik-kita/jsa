package business_logic.login;

import business_logic.MainGuest;
import engine.OnixWebDriver;
import pageobjects.BaseLogoutModePageObject;
import pageobjects.MainPO;
import pageobjects.login.HomeLoginModePO;
import pageobjects.login.MainLoginModePO;

public class HomeUser implements LoginMode {
    HomeLoginModePO homeLoginModePO;
    static String endPoit = "users/#/home";

    public HomeUser(HomeLoginModePO homeLoginModePO) {
        this.homeLoginModePO = homeLoginModePO;
    }

    public static HomeUser quickGet(LoginMode po) {
        OnixWebDriver driver = po.getDriver();
        driver.get(baseUrl + endPoit);
        return new HomeUser(new HomeLoginModePO(driver));
    }

    public MainUser goMainUser() {
        MainLoginModePO mainLoginModePO = homeLoginModePO
                .goMainPage();
        return new MainUser(mainLoginModePO);
    }

    public MainGuest logout() {
        MainPO mainPO = homeLoginModePO.openUserDropDown().logout();
        return new MainGuest(mainPO);
    }

    @Override
    public OnixWebDriver getDriver() {
        return homeLoginModePO.getDriver();
    }
}
