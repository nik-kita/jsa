package pageobjects;

import locators.GeneralHeaderLocator;
import org.openqa.selenium.WebDriver;

public abstract class BasePageObject {
    WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public HomePO goHome() {
        driver.findElement(GeneralHeaderLocator.JSA_LOGO.getPath()).click();
        return new HomePO(driver);
    }
}
