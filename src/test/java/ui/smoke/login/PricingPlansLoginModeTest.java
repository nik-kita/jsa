package ui.smoke.login;

import pageobjects.locators.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.login.PricingPlansLoginModePO;
import ui.OnixAssert;

public class PricingPlansLoginModeTest extends JsaLoginBaseTestRunner {
    @BeforeClass
    public void goPricingPlansLoginModePage() {
        homeLoginModePO.goMainPage()
                .goPricingPage()
                .goPricingPlans();
    }

    @Test(dataProvider = "getPricingPlansLoginModeLocators")
    public void pricingPlansLoginModeTest(OnixLocator locator) {
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getPricingPlansLoginModeLocators() {
        return PricingPlansLoginModePO.Locator.values();
    }
}
