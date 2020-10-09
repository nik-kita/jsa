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
    private Map<String, Boolean> onixSettings;

    public OnixWebDriver(WebDriver driver) {
        this.onixSettings = new HashMap<>();
        this.driver = driver;
    }

    public void setSetting(String setting, Boolean status) {
        onixSettings.put(setting, status);
    }

    public boolean checkSetting(String setting) {
        if(onixSettings.containsKey(setting)) {
            return onixSettings.get(setting);
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

    public boolean isPresent(OnixLocator locator) {
        return findElements(locator).size() > 0;
    }

}
