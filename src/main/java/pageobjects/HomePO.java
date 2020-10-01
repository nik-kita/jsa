package pageobjects;

import locators.GeneralHeaderLocator;
import locators.HomePageLocator;
import org.openqa.selenium.WebDriver;

public class HomePO extends BasePageObject {
    public HomePO(WebDriver driver) {
        super(driver);
    }

    public ChallengePO goChallengePage() {
        driver.
                findElement(GeneralHeaderLocator.CHALLENGE_HEADER_BUTTON.getPath()).
                click();

        return new ChallengePO(driver);
    }
}
