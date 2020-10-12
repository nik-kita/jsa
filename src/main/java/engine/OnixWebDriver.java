package engine;

import locators.OnixLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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
        if (onixSettings.containsKey(setting)) {
            return onixSettings.get(setting);
        }
        return false;
    }

    public OnixWebElement findElement(OnixLocator locator) {
        return new OnixWebElement((driver.findElement(locator.getPath())));
    }

    public OnixWebElement findElement(By seleniumPath) {
        return new OnixWebElement(driver.findElement(seleniumPath));
    }

    public WebDriver getSeleniumDriver() {
        return driver;
    }

    public List<OnixWebElement> findElements(OnixLocator locator) {
        List<OnixWebElement> result = new ArrayList<>();
        for (WebElement e : driver.findElements(locator.getPath())) {
            result.add(new OnixWebElement(e));
       }
        return result;
    }

    public List<OnixWebElement> findElements(By seleniumPath) {
        List<OnixWebElement> result = new ArrayList<>();
        for (WebElement e : driver.findElements(seleniumPath)) {
            result.add(new OnixWebElement(e));
        }
        return result;
    }

    public OnixWebElement waitVisibility(OnixLocator locator, int seconds) {
        return new OnixWebElement(new WebDriverWait(driver, Duration.ofSeconds(seconds))
                .until(ExpectedConditions.visibilityOfElementLocated(locator.getPath())));
    }

    public OnixWebElement waitVisibility(OnixLocator locator) {
        return waitVisibility(locator, 5);
    }

    public OnixWebElement waitVisibility(By seleniumPath, int seconds) {
        return new OnixWebElement(new WebDriverWait(driver, Duration.ofSeconds(seconds))
                .until(ExpectedConditions.visibilityOfElementLocated(seleniumPath)));
    }

    public OnixWebElement waitVisibility(By seleniumPath) {
        return waitVisibility(seleniumPath, 5);
    }

    public void scrollPageDown() {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollUp() {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
    }

    public void scrollTo(OnixLocator locator) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", findElement(locator));
    }

    public void scrollTo(By seleniumPath) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", findElement(seleniumPath));
    }

    public void scrollTo(OnixWebElement element) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", element.getSeleniumWebElement());
    }

    public void scrollTo(WebElement element) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void protectedScrollTo(OnixLocator locator, int wait) {
        scrollTo(waitVisibility(locator, wait));
    }

    public void protectedScrollTo(By seleniumPath, int wait) {
        scrollTo(waitVisibility(seleniumPath, wait));
    }

    public void protectedScrollTo(OnixLocator locator) {
        scrollTo(waitVisibility(locator));
    }

    public void protectedScrollTo(By seleniumPath) {
        scrollTo(seleniumPath);
    }

    public void get(String url) {
        driver.get(url);
    }

    public void quit() {
        driver.quit();
    }

    public boolean isElementPresent(OnixLocator locator) {
        return findElements(locator).size() > 0;
    }

}
