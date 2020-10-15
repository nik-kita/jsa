package business_logic.login;

import engine.OnixWebDriver;
import pageobjects.login.MainLoginModePO;

public class MainUser implements LoginMode {
    MainLoginModePO mainLoginModePO;
    public MainUser(MainLoginModePO mainLoginModePO) {
        this.mainLoginModePO = mainLoginModePO;
    }

    public static MainUser quickGet(LoginMode po) {
        OnixWebDriver driver = po.getDriver();
        driver.get(baseUrl);
        return new MainUser(new MainLoginModePO(driver));
    }

    @Override
    public OnixWebDriver getDriver() {
        return mainLoginModePO.getDriver();
    }
}
