package ui.smoke;

import locators.OnixLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.blog.BlogPO;
import ui.OnixAssert;
import ui.OnixTestRunner;

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
        return BlogPO.Locator.values();
    }
}
