package business_logic;

import business_logic.login.HomeUser;
import data.User;
import engine.OnixWebDriver;
import pageobjects.MainPO;
import pageobjects.login.HomeLoginModePO;

public class MainGuest implements LogoutMode {
    MainPO mainPO;

    public MainGuest(MainPO mainPO) {
        this.mainPO = mainPO;
    }

    public HomeUser login(User user) {
        HomeLoginModePO homeLoginModePO = mainPO
                .goLoginPage()
                .login(user);
        return new HomeUser(homeLoginModePO);
    }

    public Transformations goTransformations() {
        return new Transformations(mainPO.goTransformationsPage());

    }

    @Override
    public OnixWebDriver getDriver() {
        return mainPO.getDriver();
    }
}
