package ui.smoke.login;

import locators.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.login.PricingLoginModePO;
import pageobjects.login.PricingPlansLoginModePO;
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
        return PricingLoginModePO.Locator.values();
    }
}
