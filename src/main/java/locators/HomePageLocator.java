package locators;

import org.openqa.selenium.By;

public enum HomePageLocator implements Locator {
    CREATE_ACCOUNT_BUTTON_INNER_PAGE(By.cssSelector(".inner_page a[href='/users/register/']")),
    EMAIL_INPUT_INNER_PAGE(By.cssSelector("input[name='email']")),
    SIGN_UP_BUTTON_INNER_PAGE(By.cssSelector("button[onclick='submitRegisterInterest()']")),

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
