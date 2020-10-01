package ui.smoke;

import locators.ChallengePageLocator;
import locators.Locator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.JsaAssert;
import ui.JsaTestRunner;

public class ChallengeTest extends JsaTestRunner {

    @Test(dataProvider = "getChallengePageLocators")
    public void challengePageTest(Locator locator) {
        new JsaAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getChallengePageLocators() {
        return ChallengePageLocator.values();
    }
}
