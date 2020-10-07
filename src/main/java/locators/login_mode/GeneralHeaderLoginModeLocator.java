package locators.login_mode;

import locators.OnixLocator;
import org.openqa.selenium.By;

public enum GeneralHeaderLoginModeLocator implements OnixLocator {
    JSA_LOGO(By.xpath("//a[@href='/']")),
    HOME(By.cssSelector("#navbar [href='#/home']")),
    WORKOUTS(By.cssSelector("#navbar [href='#/workouts']")),
    LEARN(By.cssSelector("#navbar #coaching")),
    NUTRITION(By.cssSelector("#navbar #nutrition")),
    MY_CABINET_DROPDOWN(By.id("navbarDropdownMenuLink")),

    ;

    private By path;

    GeneralHeaderLoginModeLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }

    public enum UserCabinetLocator implements OnixLocator {
        ACCOUNT(By.cssSelector(".dropdown-menu [href='/users/account']")),
        PRICING(By.cssSelector(".dropdown-menu [href='/users/pricing']")),
        FAQs(By.xpath("//a[contains(text(), 'FAQs')]")),
        LOG_OUT(By.cssSelector("[href='/accounts/logout']"))


        ;

        private By path;

        UserCabinetLocator(By path) {
            this.path = path;
        }

        @Override
        public By getPath() {
            return path;
        }
    }
}
