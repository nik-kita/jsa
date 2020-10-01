package pageobjects;

import org.openqa.selenium.WebDriver;

public abstract class BasePageObject {
    WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }
}
