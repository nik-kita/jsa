package locators;

import org.openqa.selenium.By;

public enum MainPageLocator implements OnixLocator {
    GET_STARTED_BUTTON_BANNER(By.cssSelector(".banner a[href='/users/register/']")),
    PLAY_STORE_BUTTON_BANNER(By.cssSelector(".banner img[alt='playstore']")),
    APPSTORE_BUTTON_BANNER(By.cssSelector(".banner img[alt='appstore']")),
    INSTAGRAM_BUTTON_INTRODUCTION(By.cssSelector(".introduction .insta")),
    PLAY_STORE_BUTTON_DOWNLOAD(By.cssSelector(".download img[alt='playstore']")),
    FACEBOOK_BUTTON_INTRODUCTION(By.cssSelector(".introduction .facebook")),
    APPSTORE_BUTTON_DOWNLOAD(By.cssSelector(".download img[alt='appstore']")),
    ABOUT_CHALLENGES_MOTIVATION(By.cssSelector(".motivation [href='/challenge/about/']")),
    TRANSFORMATIONS_BUTTON_MEMBER_TRANSFORMATIONS(By.cssSelector(".member_transformations [href='/transformations/']")),
    EMAIL_INPUT_DAILY_EMAILS(By.cssSelector("input[name='email']")),
    SIGN_UP_DAILY_EMAILS(By.cssSelector("#daily-button")),


    ;

    MainPageLocator(By path) {
        this.path = path;
    }

    private By path;

    @Override
    public By getPath() {
        return path;
    }
}
