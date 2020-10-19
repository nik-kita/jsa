package ui.smoke;

import org.apache.commons.lang3.ArrayUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.BlogPO;
import pageobjects.general_parts.GeneralFooter;
import pageobjects.general_parts.OnixLocator;
import pageobjects.general_parts.logout_mode.GeneralHeaderLogoutModeLocator;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class BlogPageTest extends OnixTestRunner {
    BlogPO blogPO;
    @BeforeClass
    public void goBlockPage() {
        blogPO = openSite().goBlogPageFromFooter(driver);
    }

    @Test(dataProvider = "getBlogPageLocators")
    public void blogPageTest(OnixLocator[] locators) {
        for(OnixLocator locator : locators) {
            new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
        }
    }
    @DataProvider
    public Object[] getBlogPageLocators() {
        return mergeArrays(
            BlogPO.Locator.values(),
            GeneralHeaderLogoutModeLocator.HeaderLocator.values(),
            GeneralFooter.FooterLocator.values()
        );
    }


}
