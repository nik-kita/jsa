package ui.smoke;

import locators.BlogPageLocator;
import locators.OnixLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.OnixAssert;
import ui.OnixTestRunner;

import java.util.concurrent.TimeUnit;

public class BlogTest extends OnixTestRunner {
    @BeforeClass
    public void goBlogPage() {
        welcome().goBlogPage();
    }

    @Test(dataProvider = "getBlogLocators")
    public void blogPageTest(OnixLocator locator) {
        new OnixAssert(getDriver()).checkCountOfElementByLocator(locator, 1);
    }

    @DataProvider
    public Object[] getBlogLocators() {
        return BlogPageLocator.values();
    }
}
