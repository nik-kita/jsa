package ui.smoke.login;

import locators.OnixLocator;
import locators.PricingPageLocator;
import locators.login_mode.PricingLoginModeLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.OnixAssert;

public class PricingLoginModeTest extends JsaLoginBaseTestRunner {
    @BeforeClass
    public void goPricingPage() {
        homeLoginModePO.goMainPage()
                .goPricingPage();
    }

    @Test(dataProvider = "getPricingLoginModePageLocators")
    public void pricingLoginModeTest(OnixLocator locator) {
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }
    @DataProvider
    public Object[] getPricingLoginModePageLocators() {
        return PricingLoginModeLocator.values();
    }
}
