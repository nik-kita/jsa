package ui.negative;

import data.User;
import locators.OnixLocator;
import locators.login_mode.GeneralHeaderLoginModeLocator;
import locators.login_mode.HomeLoginModeLocator;
import locators.login_mode.PricingPlansLoginModeLocator;
import locators.login_mode.popups.PaymentMethodPopup;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pageobjects.login.PricingPlansLoginModePO;
import pageobjects.login.UserCabinetDropdownPO;
import ui.OnixAssert;
import ui.OnixTestListener;
import ui.OnixTestRunner;
import ui.smoke.login.JsaLoginBaseTestRunner;

import java.util.concurrent.TimeUnit;

@Listeners(OnixTestListener.class)
public class RandomBugsCatcher extends OnixTestRunner {
    PricingPlansLoginModePO pricingPlansLoginModePO;
    @BeforeMethod
    public void startJsa() {
        welcome();
        pricingPlansLoginModePO = mainPO.goLoginPage()
                .login(User.getValidUser())
                .goMainPage()
                .goPricingPage()
                .goPricingPlans();
    }

    @Test(invocationCount = 50)
    public void test_2() {
        PaymentMethodPopup p = pricingPlansLoginModePO.subscribePremium()
                .clickPayPalTab();

//        PaymentMethodPopup paymentMethodPopup = mainPO.goLoginPage()
//                .login(User.getValidUser())
//                .goMainPage()
//                .goPricingPage()
//                .goPricingPlans()
//                .subscribePremium();
        //TODO in this place sometimes we should have some iframes
//        paymentMethodPopup.clickPayPalTab();
//        try {
//            Thread.sleep(100000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        driver.findElement(PaymentMethodPopup.CardMethodLocator.PAY_PALL_TAB).click();

        SoftAssert sa = new SoftAssert();
        sa.assertTrue(driver.getSeleniumDriver().findElements(By.xpath("//div[@id='nav-paypal']/div[@style='display: block;']")).size() == 1);
        pricingPlansLoginModePO = p.exit();
        sa.assertAll();
    }

    @AfterMethod
    public void logout() {
        pricingPlansLoginModePO.goHome().openUserDropDown();
        driver.findElement(HomeLoginModeLocator.UserCabinetLocator.LOG_OUT).click();
    }
}
