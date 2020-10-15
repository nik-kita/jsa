package pageobjects.locators.login_mode;

import org.openqa.selenium.By;
import pageobjects.locators.OnixLocator;

public interface GeneralHeaderLoginModeLocator {
    enum HeaderLocator implements OnixLocator {
        JSA_LOGO(By.cssSelector("a[href='/'] img")),
        BOOK_LOGO(By.cssSelector(".nav a[href='/not-a-diet-book/'] img")),//TODO there are two books logos on this locator
        PRICING_HEADER_BUTTON(By.cssSelector(".nav a[href='/pricing/']")),
        TRANSFORMATIONS_HEADER_BUTTON(By.cssSelector(".nav a[href='/transformations/']")),
        CHALLENGE_HEADER_BUTTON(By.cssSelector(".nav a[href='/challenge/about/']")),

        TO_USER_HOME_CORNER_LINK(By.cssSelector("[href='/users/']")),


        ;

        private By path;

        HeaderLocator(By path) {
            this.path = path;
        }

        @Override
        public By getPath() {
            return path;
        }
    }
}