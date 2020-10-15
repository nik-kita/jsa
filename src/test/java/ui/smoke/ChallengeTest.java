package ui.smoke;

import pageobjects.locators.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.ChallengePO;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class ChallengeTest extends OnixTestRunner {

    @BeforeClass
    public void goChallengePage() {
        openSite().goChallengePage();
    }

    @Test(dataProvider = "getChallengePageLocators")
    public void challengePageTest(OnixLocator locator) {
        new OnixAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getChallengePageLocators() {
        return ChallengePO.Locator.values();
    }
}
