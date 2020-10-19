package ui.smoke;

import pageobjects.general_parts.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.PricingPO;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class PricingTest extends OnixTestRunner {

    @BeforeClass
    public void goPricingPage() {
        openSite().goPricingPage();
    }

    @Test(dataProvider = "getPricingLocators")
    public void pricingTest(OnixLocator locator) {
        new OnixAssert(getDriver()).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getPricingLocators() {
        return PricingPO.Locator.values();
    }
}
