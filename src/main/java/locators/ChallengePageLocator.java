package locators;

import org.openqa.selenium.By;

public enum ChallengePageLocator implements Locator {
    CREATE_ACCOUNT_BUTTON_INNER_PAGE(By.cssSelector(".inner_page a[href='/users/register/']")),
    EMAIL_INPUT_INNER_PAGE(By.cssSelector("input[name='email']")),
    SIGN_UP_BUTTON_INNER_PAGE(By.cssSelector("button[onclick='submitRegisterInterest()']")),


    ;

    private By path;

    ChallengePageLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}