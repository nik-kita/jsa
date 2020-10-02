package ui;

import locators.OnixLocator;
import engine.OnixWebDriver;
import org.testng.Assert;

public class OnixAssert {
    OnixWebDriver driver;

    public OnixAssert(OnixWebDriver driver) {
        this.driver = driver;
    }

    public void checkCountOfElementByLocator(OnixLocator locator, int expectedElCount) {
        int actualElCount = driver
                .findElements(locator)
                .size();

        String errorMessage = "\nWebElement: " + locator.name() +
                "\nLocation: " + locator.getPath() +
                "\nExpected numbers of elements: " + expectedElCount +
                "\nBut actual: " + actualElCount;

        Assert.assertEquals(actualElCount, expectedElCount, errorMessage);
    }
}
