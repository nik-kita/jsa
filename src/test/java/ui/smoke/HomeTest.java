package ui.smoke;

import locators.HomeLocator;
import locators.Locator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.JsaTestRunner;

public class HomeTest extends JsaTestRunner {

    @Test(testName = "Smoke test of Home page", dataProvider = "All Home page locators")
    public void headerButtons(Locator button) {

    }

    @DataProvider(name = "All Home page locators")
    public Object[] getHomeLocators() {
        return HomeLocator.values();
    }
}
