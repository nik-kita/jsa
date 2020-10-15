package ui.jsa_test_cases;

import business_logic.MainGuest;
import business_logic.login.PaymentMethod;
import data.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.locators.OnixLocator;
import pageobjects.login.popups.PaymentMethodPopup;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class WS extends OnixTestRunner {
    MainGuest mainGuest;
    @BeforeMethod
    public void startFromMainPage() {
        mainGuest = new MainGuest(openSite());
    }




    @Test(testName = "Pricing (WS)")
    public void test_2() {
        PaymentMethod paymentMethod = mainGuest.login(User.getValidUser())
                .goMainUser()
                .goPricing()
                .subscribe()
                .subscribePremium();
        SoftAssert softAssert = new SoftAssert();
        for(OnixLocator l : PaymentMethodPopup.Locator.values()) {
            softAssert = new OnixAssert(driver).softCheckCountOfElementByLocator(l, 1, softAssert);
        }
        paymentMethod = paymentMethod
                .close()
                .subscribeStandard();
        for(OnixLocator l : PaymentMethodPopup.Locator.values()) {
            softAssert = new OnixAssert(driver).softCheckCountOfElementByLocator(l, 1, softAssert);
        }
        paymentMethod = paymentMethod
                .close()
                .buyNowPremium();
        for(OnixLocator l : PaymentMethodPopup.Locator.values()) {
            softAssert = new OnixAssert(driver).softCheckCountOfElementByLocator(l, 1, softAssert);
        }
        mainGuest = paymentMethod
                .close()
                .goMain()
                .logout();
        softAssert.assertAll();
    }



}
