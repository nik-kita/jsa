package ui.smoke;

import pageobjects.locators.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.JoinNowPO;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class JoinNowPageTest extends OnixTestRunner {
    @BeforeClass
    public void goJoinNowPage() {
        welcome().goJoinNowPage();
    }

    @Test(dataProvider = "getJoinNowLocators")
    public void joinNowPageTest(OnixLocator locator) {
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getJoinNowLocators() {
        return JoinNowPO.Locator.values();
    }
}
