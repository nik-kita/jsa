package pageobjects;

import data.User;
import engine.OnixWebDriver;
import engine.OnixWebElement;
import locators.LoginPageLocator;

public class LoginPO {
    OnixWebDriver driver;
    public LoginPO(OnixWebDriver driver) {
        this.driver = driver;
    }

    public HomePO goHomePage() {
        driver.findElement(LoginPageLocator.JSA_LOGO).click();
        return new HomePO(driver);
    }

    private OnixWebElement getUserInput() {
        return driver.findElement(LoginPageLocator.USERNAME_INPUT);
    }

    private OnixWebElement getPasswordInput() {
        return driver.findElement(LoginPageLocator.PASSWORD_INPUT);
    }

    private OnixWebElement getSubmitButton() {
        return driver.findElement(LoginPageLocator.GET_STARTED_BUTTON);
    }

    private void fillUserInput(String userNameOrEmail) {
        getUserInput().sendKeys(userNameOrEmail);
    }

    private void fillPasswordInput(String password) {
        getPasswordInput().sendKeys(password);
    }

    public void login(User validUser) {
        fillUserInput(validUser.getName());
        fillPasswordInput(validUser.getPassword());
        getSubmitButton().click();
    }


}
