package shorthands;

import data.User;
import engine.OnixWebDriver;
import pageobjects.BasePageObject;
import pageobjects.LoginPO;
import pageobjects.login.HomeLoginModePO;

public class RouteHacks extends BasePageObject {
    OnixWebDriver driver;
    String loginEndPoint = "users/login/";

    public RouteHacks(OnixWebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public HomeLoginModePO login(String nameOrEmail, String password) {
        String urlForLogin = driver.getSeleniumDriver().getCurrentUrl() + loginEndPoint;
        driver.get(urlForLogin);
        LoginPO loginPO = new LoginPO(driver);
        User user = new User(nameOrEmail, password);
        return loginPO.login(user);
    }
    public HomeLoginModePO login(User user) {
        String urlForLogin = driver.getSeleniumDriver().getCurrentUrl() + loginEndPoint;
        driver.get(urlForLogin);
        LoginPO loginPO = new LoginPO(driver);
        return loginPO.login(user);
    }
    public HomeLoginModePO login() {
        String urlForLogin = driver.getSeleniumDriver().getCurrentUrl() + loginEndPoint;
        driver.get(urlForLogin);
        return new LoginPO(driver).login(User.getValidUser());
    }
}
