package engine;

import locators.OnixLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnixWebDriver {
    private WebDriver driver;
    private Map<String, Boolean> checkSettings;

    public OnixWebDriver(WebDriver driver) {
        this.checkSettings = new HashMap<>();
        this.driver = driver;
    }

    public void setSetting(String setting, Boolean status) {
        checkSettings.put(setting, status);
    }

    public boolean checkSetting(String setting) {
        if(checkSettings.containsKey(setting)) {
            return checkSettings.get(setting);
        }
        return false;
    }

    public OnixWebElement findElement(OnixLocator locator) {
        return new OnixWebElement((driver.findElement(locator.getPath())));
    }

    public WebDriver getSeleniumDriver() {
        return driver;
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
