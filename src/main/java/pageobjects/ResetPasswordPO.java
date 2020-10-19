package pageobjects;

import engine.OnixWebDriver;
import org.openqa.selenium.By;
import pageobjects.general_parts.OnixLocator;

public class ResetPasswordPO extends BaseLogoutModePageObject {
    public ResetPasswordPO(OnixWebDriver driver) {
        super(driver);
    }

    public enum Locator implements OnixLocator {
        EMAIL_INPUT(By.cssSelector("input#id_email")),
        ENTER_BUTTON(By.cssSelector("input[type='submit']"))
        ;
        private By path;

        Locator(By path) {
            this.path = path;
        }

        @Override
        public By getPath() {
            return path;
        }
    }
}
