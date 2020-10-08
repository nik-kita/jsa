package ui;

import locators.OnixLocator;
import engine.OnixWebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class OnixAssert {
    OnixWebDriver driver;

    public OnixAssert(OnixWebDriver driver) {
        this.driver = driver;
    }

    public void checkCountOfElementByLocator(OnixLocator locator, int expectedElCount) {
        int actualElCount = driver
                .findElements(locator)
                .size();

        String errorMessage = "\n\n" +
                "\n----------------------------" +
                "\nIn " + locator.getClass().getName() + " class\n" +
                "\n" + locator.name() +
                "\n" + locator.getPath() +
                "\n----------------------------" +
                "\n=== NUMBER OF ELEMENTS ===\n";
        Assert.assertEquals(actualElCount, expectedElCount, errorMessage);
    }

    public SoftAssert softCheckCountOfElementByLocator(OnixLocator locator, int expectedElCount, SoftAssert softAssert) {
        int actualElCount = driver
                .findElements(locator)
                .size();

        String errorMessage = "\n\n" +
                "\n----------------------------" +
                "\nIn " + locator.getClass().getName() + " class\n" +
                "\n" + locator.name() +
                "\n" + locator.getPath() +
                "\n----------------------------" +
                "\n=== NUMBER OF ELEMENTS ===\n";
        softAssert.assertEquals(actualElCount, expectedElCount, errorMessage);
        return softAssert;
    }
}
