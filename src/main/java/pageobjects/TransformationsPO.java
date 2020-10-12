package pageobjects;

import engine.OnixWebDriver;
import locators.OnixLocator;
import org.openqa.selenium.By;

public class TransformationsPO extends BaseLogoutModePageObject {
    public TransformationsPO(OnixWebDriver driver) {
        super(driver);
    }

    public enum Locator implements OnixLocator {
        SEE_MORE_BUTTON(By.cssSelector(".transformation_wr a"))

        ;

        private By path;

        Locator(By path) {
            this.path = path;
        }

    }

}
