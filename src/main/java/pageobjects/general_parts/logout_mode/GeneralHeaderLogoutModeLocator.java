package pageobjects.general_parts.logout_mode;

import org.openqa.selenium.By;
import pageobjects.general_parts.OnixLocator;

public interface GeneralHeaderLogoutModeLocator {
    enum HeaderLocator implements OnixLocator {
        JSA_LOGO(By.cssSelector("a[href='/'] img")),

        PRICING_HEADER_BUTTON(By.cssSelector(".nav a[href='/pricing/']")),
        TRANSFORMATIONS_HEADER_BUTTON(By.cssSelector(".nav a[href='/transformations/']")),
        CHALLENGE_HEADER_BUTTON(By.cssSelector(".nav a[href='/challenge/about/']")),
        LOGIN_HEADER_BUTTON(By.cssSelector(".nav a[href='/users/login/']")),
        JOIN_NOW_HEADER_BUTTON(By.cssSelector(".nav a[href='/users/register/']")),



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
