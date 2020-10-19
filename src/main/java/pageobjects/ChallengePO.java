package pageobjects;

import engine.OnixWebDriver;
import pageobjects.general_parts.OnixLocator;
import org.openqa.selenium.By;

public class ChallengePO extends BaseLogoutModePageObject {
    public ChallengePO(OnixWebDriver driver) {
        super(driver);
    }


    public enum Locator implements OnixLocator {
        CREATE_ACCOUNT_BUTTON_INNER_PAGE(By.cssSelector(".inner_page a[href='/users/register/']")),
        EMAIL_INPUT_INNER_PAGE(By.cssSelector("input[name='email']")),
        SIGN_UP_BUTTON_INNER_PAGE(By.cssSelector("button[onclick='submitRegisterInterest()']")),
        PREMIUM_PLAN_LINK(By.cssSelector("[href='/users/pricing/']")),



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
