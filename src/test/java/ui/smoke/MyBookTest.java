package ui.smoke;

import locators.MyBookPageLocator;
import locators.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class MyBookTest extends OnixTestRunner {
    @BeforeClass
    public void goMyBookPage() {
        welcome().goMyBookPage();
    }

    @Test(dataProvider = "getMyBookLocators")
    public void myBookPageTest(OnixLocator locator) {
        new OnixAssert(getDriver()).
                checkCountOfElementByLocator(locator, 1);

    }

    @DataProvider
    public Object[] getMyBookLocators() {
        return MyBookPageLocator.values();
    }
}
