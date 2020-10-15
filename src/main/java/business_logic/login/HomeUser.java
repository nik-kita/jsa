package business_logic.login;

import engine.OnixWebDriver;
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

    @Override
    public OnixWebDriver getDriver() {
        return homeLoginModePO.getDriver();
    }
}
