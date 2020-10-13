package pageobjects;

import engine.OnixWebDriver;
import locators.OnixLocator;
import org.openqa.selenium.By;

public class JoinNowPO extends BaseLogoutModePageObject {
    public JoinNowPO(OnixWebDriver driver) {
        super(driver);
    }

    public enum Locator implements OnixLocator {
        JSA_LOGO(By.xpath("//a[@href='/']")),
        USERNAME_INPUT(By.xpath("//input[@name='username']")),
        EMAIL_INPUT(By.xpath("//input[@name='email']")),
        PASSWORD_INPUT(By.id("password")),
        PASSWORD_CONFIRMATION_INPUT(By.id("password2")),
        TERMS_CHECKBOX(By.xpath("//input[@name='terms']")),
        TERMS_OF_SERVICE_LINK(By.xpath("//a[@href='/terms/']")),
        PRIVACY_POLICY_LINK(By.xpath("//a[@href='/privacy/']")),
        CREATE_ACCOUNT_BUTTON(By.id("formButton")),
        FACEBOOK_BUTTON(By.cssSelector(".fb-button")),
        APPLE_BUTTON(By.cssSelector(".apple-button")),
        SIGN_IN_BUTTON(By.cssSelector("a[href='/users/login/']")),







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