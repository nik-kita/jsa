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

    ;

    private By path;

    HomeLoginModeLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
