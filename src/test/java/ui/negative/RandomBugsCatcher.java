package ui.negative;

import data.User;
import locators.OnixLocator;
import locators.login_mode.popups.PaymentMethodPopup;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ui.OnixAssert;
import ui.OnixTestListener;
import ui.OnixTestRunner;
import ui.smoke.login.JsaLoginBaseTestRunner;

@Listeners(OnixTestListener.class)
public class RandomBugsCatcher extends OnixTestRunner {
    @BeforeClass
    public void startJsa() {
        welcome();
    }

    @Test(invocationCount = 20)
    public void test_2() {
        PaymentMethodPopup paymentMethodPopup = mainPO.goLoginPage()
                .login(User.getValidUser())
                .goMainPage()
                .goPricingPage()
                .goPricingPlans()
                .subscribePremium();
        //TODO in this place sometimes we should have some iframes
//        paymentMethodPopup.clickPayPalTab();
//        try {
//            Thread.sleep(100000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        paymentMethodPopup.clickPayPalTab();
        Assert.assertTrue(driver.getSeleniumDriver().findElements(By.cssSelector("iframe")).size() == 1);

    }
}
