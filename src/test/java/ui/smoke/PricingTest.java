package ui.smoke;

import org.testng.annotations.BeforeClass;
import ui.OnixTestRunner;

public class PricingTest extends OnixTestRunner {

    @BeforeClass
    public void goPricingPage() {
        welcome().goPricingPage();
    }
}
