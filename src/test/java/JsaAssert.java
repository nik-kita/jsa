import locators.Locator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JsaAssert {
    WebDriver driver;

    public JsaAssert(WebDriver driver) {
        this.driver = driver;
    }

    public void isElementPresentAndUnique(Locator locator, int expectedElCount) {
        int actualElCount = driver
                .findElements(locator.getPath())
                .size();

        String errorMessage = "WebElement: " + locator.name() +
                "\nLocation: " + locator.getPath() +
                "\nExpected numbers of elements: " + expectedElCount +
                "\nBut actual: " + actualElCount;

        Assert.assertEquals(actualElCount, expectedElCount, errorMessage);
    }
}
