package ui.wwwwwwwwwwwwwwww;

import data.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.LoginPO;
import shorthands.RouteHacks;
import ui.OnixTestRunner;

public class LoginTest extends OnixTestRunner {
    @BeforeClass
    public void goLoginPage() {
        welcome().goLoginPage();
    }

    @Test
    public void testLogin() {
        User user = User.getValidUser();
        new LoginPO(driver).login(user);
    }


}
