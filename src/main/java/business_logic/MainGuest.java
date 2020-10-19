package business_logic;

import business_logic.login.HomeUser;
import data.User;
import engine.OnixWebDriver;
import pageobjects.JoinNowPO;
import pageobjects.LoginPO;
import pageobjects.MainPO;
import pageobjects.login.HomeLoginModePO;

public class MainGuest implements LogoutMode {
    MainPO mainPO;

    public MainGuest(MainPO mainPO) {
        this.mainPO = mainPO;
    }

    public LoginPO goLoginPage() {
        return mainPO.goLoginPage();
    }

    public HomeUser login(User user) {
        HomeLoginModePO homeLoginModePO = mainPO
                .goLoginPage()
                .login(user);
        return new HomeUser(homeLoginModePO);
    }

    public HomeUser loginWithFB(User user) {
        HomeLoginModePO homeLoginModePO = mainPO
                .goLoginPage()
                .loginByFB(user);
        return new HomeUser(homeLoginModePO);
    }

    public Transformations goTransformations() {
        return new Transformations(mainPO.goTransformationsPage());

    }

    public Blog goBlog() {
        return new Blog(mainPO.goBlogPageFromFooter());
    }

    public JoinNowPO goJoinNowPage() {
        return mainPO.goJoinNowPage();
    }

    @Override
    public OnixWebDriver getDriver() {
        return mainPO.getDriver();
    }
}
