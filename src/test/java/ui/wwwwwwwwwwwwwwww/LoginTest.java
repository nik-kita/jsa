package ui.wwwwwwwwwwwwwwww;

import data.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.LoginPO;
import ui.OnixTestRunner;

public class LoginTest extends OnixTestRunner {
    @BeforeClass
    public void goLoginPage() {
        welcome().goLoginPage();
    }

    @Test
    public void testLogin() {
        new LoginPO(driver).login(User.getValidUser());
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
