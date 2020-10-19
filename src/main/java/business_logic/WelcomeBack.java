package business_logic;

import business_logic.login.HomeUser;
import data.User;
import pageobjects.LoginPO;
import pageobjects.login.HomeLoginModePO;

public class WelcomeBack {
    private LoginPO loginPO;

    public WelcomeBack(LoginPO loginPO) {
        this.loginPO = loginPO;
    }

    public HomeUser getStarted(User user) {
        return new HomeUser(loginPO.login(User.getValidUser()));
    }
}
