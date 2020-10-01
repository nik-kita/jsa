package locators;

import org.openqa.selenium.By;

public enum HomePageLocator implements Locator {
    GET_STARTED_BUTTON_BANNER(By.cssSelector(".banner a[href='/users/register/']")),
    PLAY_STORE_BUTTON_BANNER(By.cssSelector(".banner img[alt='playstore']")),
    APPSTORE_BUTTON_BANNER(By.cssSelector(".banner img[alt='appstore']")),
    INSTAGRAM_BUTTON_INTRODUCTION(By.cssSelector(".introduction .insta")),
    INSTAGRAM_BUTTON_DOWNLOAD(By.cssSelector(".download .insta")),
    FACEBOOK_BUTTON_INTRODUCTION(By.cssSelector(".introduction .facebook")),
    FACEBOOK_BUTTON_DOWNLOAD(By.cssSelector(".download .facebook")),
    ABOUT_CHALLENGES_MOTIVATION(By.cssSelector(".motivation [href='/challenge/about/']")),
    TRANSFORMATIONS_BUTTON_MEMBER_TRANSFORMATIONS(By.cssSelector(".member_transformations [href='/transformations/']")),
    EMAIL_INPUT_DAILY_EMAILS(By.cssSelector("input[name='email']")),
    SIGN_UP_DAILY_EMAILS(By.cssSelector("#daily-button")),


    ;

    HomePageLocator(By path) {
        this.path = path;
    }

    private By path;

    @Override
    public By getPath() {
        return path;
    }
}
