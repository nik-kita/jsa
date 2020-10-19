package pageobjects;

import data.User;
import engine.OnixWebDriver;
import engine.OnixWebElement;
import pageobjects.general_parts.OnixLocator;
import org.openqa.selenium.By;
import pageobjects.login.HomeLoginModePO;

public class LoginPO extends BaseLogoutModePageObject {


    public LoginPO(OnixWebDriver driver) {
        super(driver);
    }

    public MainPO goHomePage() {
        driver.findElement(Locator.JSA_LOGO).click();
        return new MainPO(driver);
    }

    private OnixWebElement getUserInput() {
        return driver.findElement(Locator.USERNAME_INPUT);
    }

    private OnixWebElement getPasswordInput() {
        return driver.findElement(Locator.PASSWORD_INPUT);
    }

    private OnixWebElement getSubmitButton() {
        return driver.findElement(Locator.GET_STARTED_BUTTON);
    }

    private void fillUserInput(String userNameOrEmail) {
        getUserInput().sendKeys(userNameOrEmail);
    }

    private void fillPasswordInput(String password) {
        getPasswordInput().sendKeys(password);
    }

    public HomeLoginModePO login(User validUser) {
        fillUserInput(validUser.getName());
        fillPasswordInput(validUser.getPassword());
        getSubmitButton().click();
        return new HomeLoginModePO(driver);
    }

    public HomeLoginModePO loginByFB(User user) {
        driver.findElement(Locator.FACEBOOK_BUTTON).click();
        return new FB(driver)
                .login(user.getFacebookEmail(), user.getFacebookPassword());
    }

    private class FB {
        OnixWebDriver driver;
        public FB(OnixWebDriver driver) {
            this.driver = driver;
        }
        OnixLocator emailOrNumberInput = OnixLocator.makeOnixLocator(By.xpath("//input[@id='email']"));
        OnixLocator passwordInput = OnixLocator.makeOnixLocator(By.xpath("//input[@type='password']"));
        OnixLocator enterButton = OnixLocator.makeOnixLocator(By.cssSelector("#loginbutton"));
        OnixLocator confirmButton = OnixLocator.makeOnixLocator(By.xpath("//button[@name='__CONFIRM__']"));

        public HomeLoginModePO login(String name, String password) {
            driver.findElement(emailOrNumberInput).sendKeys(name);
            driver.findElement(passwordInput).sendKeys(password);
            driver.findElement(enterButton).click();
            if(driver.isElementPresent(confirmButton)) {
                driver.waitToClick(confirmButton).click();
            }
            return new HomeLoginModePO(driver);
        }
    }

    public ResetPasswordPO clickForgotPassword() {
        driver.findElement(Locator.FORGOT_PASSWORD_LINK).click();
        return new ResetPasswordPO(driver);
    }


    public enum Locator implements OnixLocator {
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

        Locator(By path) {
            this.path = path;
        }

        @Override
        public By getPath() {
            return path;
        }
    }

}
