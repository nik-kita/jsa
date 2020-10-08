package ui.smoke;

import locators.OnixLocator;
import locators.PricingPageLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class PricingTest extends OnixTestRunner {

    @BeforeClass
    public void goPricingPage() {
        welcome().goPricingPage();
    }

    @Test(dataProvider = "getPricingLocators")
    public void pricingTest(OnixLocator locator) {
        new OnixAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getPricingLocators() {
        return PricingPageLocator.values();
    }
}
