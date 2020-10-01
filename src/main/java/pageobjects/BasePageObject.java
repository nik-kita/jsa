package pageobjects;

import locators.HomeLocator;
import org.openqa.selenium.WebDriver;

public abstract class BasePageObject {
    WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public HomePO goHome() {
        driver.findElement(HomeLocator.JSA_LOGO.getPath()).click();
        return new HomePO(driver);
    }
}
