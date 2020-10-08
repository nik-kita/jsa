package locators.login_mode;

import locators.OnixLocator;
import org.openqa.selenium.By;

public enum HomeLoginModeLocator implements OnixLocator {
    MY_PLAN_IMG_LINK(By.cssSelector("[href='/users/account/my-plan")),
    GET_STARTED_6_STEPS_DIV_LINK(By.cssSelector("[href='#/home/step-two']")),
    MY_GOAL_DIV_LINK(By.cssSelector("[href='#/home/my-goal']")),
    STEPS_DIV_LINK(By.cssSelector("[href='#/home/steps']")),
    EDIT_IMG_BTM_IN_STEPS_DIV(By.cssSelector(".todays_steps img")),
    MY_PROGRESS_DIV_LINK(By.cssSelector("[href='#/home/my-progress']")),
    CHALLENGE_DIV_LINK(By.cssSelector("[href='#/home/challenges']")),
    UPGRADE_TO_ACCESS_BTN(By.cssSelector(".facebook_group [href='/users/pricing/']")),
    SUPPORT_BUTTON(By.xpath("//button[contains(text(), 'Support')]")),
    JSA_LOGO(By.xpath("//a[@href='/']")),
    HOME(By.cssSelector("#navbar [href='#/home']")),
    WORKOUTS(By.cssSelector("#navbar [href='#/workouts']")),
    LEARN(By.cssSelector("#navbar #coaching")),
    NUTRITION(By.cssSelector("#navbar #nutrition")),
    MY_CABINET_DROPDOWN(By.id("navbarDropdownMenuLink")),


    ;

    private By path;

    HomeLoginModeLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }

    public enum UserCabinetLocator implements OnixLocator {
        ACCOUNT(By.cssSelector(".dropdown-menu [href='/users/account']")),
        PRICING(By.cssSelector(".dropdown-menu [href='/users/pricing/']")),
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
