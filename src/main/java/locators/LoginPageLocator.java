package locators;

import org.openqa.selenium.By;

public enum LoginPageLocator implements OnixLocator {
    JSA_LOGO(By.xpath("//a[@href='/']")),
    USERNAME_INPUT(By.xpath("//input[@name='username']")),
    PASSWORD_INPUT(By.id("password")),
    FORGOT_PASSWORD_LINK(By.xpath("//a[contains(text(), 'Forgot')]")),
    GET_STARTED_BUTTON(By.xpath("//button[contains(text(), 'Started')]")),
    FACEBOOK_BUTTON(By.cssSelector(".fb-button")),
    APPLE_BUTTON(By.cssSelector(".apple-button")),
    CREATE_ACCOUNT_LINK(By.xpath("//*[@href='/users/register/']"))

    ;

    private By path;

    LoginPageLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
