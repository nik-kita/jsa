package business_logic.login;

import pageobjects.login.HomeLoginModePO;
import pageobjects.login.MainLoginModePO;

public class HomeUser implements LoginMode {
    HomeLoginModePO homeLoginModePO;
    public HomeUser(HomeLoginModePO homeLoginModePO) {
        this.homeLoginModePO = homeLoginModePO;
    }

    public MainUser goMainUser() {
        MainLoginModePO mainLoginModePO = homeLoginModePO
                .goMainPage();
        return new MainUser(mainLoginModePO);
    }
}
