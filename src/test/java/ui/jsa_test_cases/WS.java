package ui.jsa_test_cases;

import data.User;
import locators.OnixLocator;
import pageobjects.login.popups.PaymentMethodPopup;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class WS extends OnixTestRunner {

    @BeforeMethod
    public void startFromMainPage() {
        welcome();
    }

    @Test(testName = "My book (WS)")
    public void test_1() {
        mainPO.goMyBookPage();
        SoftAssert softAssert =  new SoftAssert();
        OnixAssert onixAssert = new OnixAssert(driver);
        for(OnixLocator l : MyBookPageLocator.values()) {
            softAssert = onixAssert.softCheckCountOfElementByLocator(l, 1, softAssert);
        }
        softAssert.assertAll();
    }

    @Test(testName = "Pricing (WS)")
    public void test_2() {
        SoftAssert softAssert = new SoftAssert();
        PaymentMethodPopup paymentMethodPopup = mainPO.goLoginPage()
                .login(User.getValidUser())
                .goMainPage()
                .goPricingPage()
                .goPricingPlans()
                .subscribePremium();
        for(OnixLocator l : PaymentMethodPopup.CardMethodLocator.values()) {
            new OnixAssert(driver).softCheckCountOfElementByLocator(l, 1, softAssert);
        }
        System.out.println("-------------------------------------------------");
        //TODO in this place sometimes we should have some iframes
//        paymentMethodPopup.clickPayPalTab();
//        try {
//            Thread.sleep(100000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        paymentMethodPopup.switchToPayPalIframe();
        for(OnixLocator l : PaymentMethodPopup.PayPalIframeLocator.values()) {
            new OnixAssert(driver).softCheckCountOfElementByLocator(l, 1, softAssert);
        }

        softAssert.assertAll();
    }



}
