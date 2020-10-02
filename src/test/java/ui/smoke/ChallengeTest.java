package ui.smoke;

import locators.ChallengePageLocator;
import locators.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class ChallengeTest extends OnixTestRunner {

    @BeforeClass
    public void goChallengePage() {
        welcome().goChallengePage();
    }

    @Test(dataProvider = "getChallengePageLocators")
    public void challengePageTest(OnixLocator locator) {
        new OnixAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getChallengePageLocators() {
        return ChallengePageLocator.values();
    }
}
