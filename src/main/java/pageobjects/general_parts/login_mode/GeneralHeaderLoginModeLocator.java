package pageobjects.general_parts.login_mode;

import engine.OnixWebDriver;
import org.openqa.selenium.By;
import pageobjects.general_parts.OnixLocator;

public interface GeneralHeaderLoginModeLocator {
    OnixWebDriver getDriver();
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