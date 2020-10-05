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
        User user = User.getValidUser();
        System.out.println("=======================================");
        System.out.println(user.getPassword());
        user.getName();
        System.out.println("=======================================");
        new LoginPO(driver).login(user);
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
