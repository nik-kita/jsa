package business_logic.login;

import pageobjects.login.MainLoginModePO;

public class MainUser implements LoginMode {
    MainLoginModePO mainLoginModePO;
    public MainUser(MainLoginModePO mainLoginModePO) {
        this.mainLoginModePO = mainLoginModePO;
    }
}
