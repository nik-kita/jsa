package ui.smoke.login;

import org.testng.asserts.SoftAssert;
import pageobjects.general_parts.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.login.PricingPlansLoginModePO;
import ui.OnixAssert;

public class PricingPlansLoginModeTest extends JsaLoginBaseTestRunner {
    PricingPlansLoginModePO pricingPlansLoginModePO;
    @BeforeClass
    public void goPricingPlansLoginModePage() {
        pricingPlansLoginModePO = homeLoginModePO.goMainPage()
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

    @Test(dataProvider = "getBlockTabLocators")
    public void blockTab(OnixLocator locator) {
        pricingPlansLoginModePO.clickBlocksButton();
        SoftAssert softAssert = new SoftAssert();
        new OnixAssert(driver).softCheckCountOfElementByLocator(locator, 1, softAssert);
        pricingPlansLoginModePO.clickSubscriptionsButton();
        softAssert.assertAll();
    }

    @DataProvider
    public Object[] getBlockTabLocators() {
        return PricingPlansLoginModePO.BlocksTabLocator.values();
    }
}
