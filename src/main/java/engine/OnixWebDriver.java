package engine;

import locators.OnixLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class OnixWebDriver {
    private WebDriver driver;

    public OnixWebDriver(WebDriver driver) {
        this.driver = driver;
    }

    public OnixWebElement findElement(OnixLocator locator) {
        return new OnixWebElement((driver.findElement(locator.getPath())));
    }

    public List<OnixWebElement> findElements(OnixLocator locator) {
        List<OnixWebElement> result = new ArrayList<>();
        for(WebElement e : driver.findElements(locator.getPath())) {
            result.add(new OnixWebElement(e));
        }
        return result;
    }

    public void get(String url) {
        driver.get(url);
    }

    public void quit() {
        driver.quit();
    }
}
