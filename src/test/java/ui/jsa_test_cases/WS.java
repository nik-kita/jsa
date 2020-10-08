package ui.jsa_test_cases;

import data.User;
import locators.MyBookPageLocator;
import locators.OnixLocator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ui.OnixAssert;
import ui.OnixTestRunner;
import ui.smoke.MainPageTest;
import ui.smoke.MyBookTest;

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
        mainPO.goLoginPage()
                .login(User.getValidUser())
                .goMainPage()
                .goPricingPage();
        //TODO
    }



}
