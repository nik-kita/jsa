package locators.login_mode;

import locators.OnixLocator;
import org.openqa.selenium.By;

public enum GeneralHeaderLoginModeLocator implements OnixLocator {
    JSA_LOGO(By.cssSelector("a[href='/'] img")),
    BOOK_LOGO(By.cssSelector(".nav a[href='/not-a-diet-book/'] img")),
    PRICING_HEADER_BUTTON(By.cssSelector(".nav a[href='/pricing/']")),
    TRANSFORMATIONS_HEADER_BUTTON(By.cssSelector(".nav a[href='/transformations/']")),
    CHALLENGE_HEADER_BUTTON(By.cssSelector(".nav a[href='/challenge/about/']")),
    BLOG_HEADER_BUTTON(By.cssSelector(".nav a[href='/blog/']")),
    TO_USER_HOME_CORNER_LINK(By.cssSelector("[href='/users/']")),


    ;

    private By path;

    GeneralHeaderLoginModeLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }


}
