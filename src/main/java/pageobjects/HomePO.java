package pageobjects;

import locators.GeneralHeaderLocator;
import locators.HomePageLocator;
import engine.OnixWebDriver;

public class HomePO extends BasePageObject {
    public HomePO(OnixWebDriver driver) {
        super(driver);
    }

    public ChallengePO goChallengePage() {
        driver.
                findElement(GeneralHeaderLocator.CHALLENGE_HEADER_BUTTON).
                click();

        return new ChallengePO(driver);
    }
}
