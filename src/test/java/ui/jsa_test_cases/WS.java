package ui.jsa_test_cases;

import business_logic.Blog;
import business_logic.MainGuest;
import business_logic.Transformations;
import business_logic.login.HomeUser;
import business_logic.login.PaymentMethod;
import data.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.BlogPO;
import pageobjects.JoinNowPO;
import pageobjects.ResetPasswordPO;
import pageobjects.general_parts.OnixLocator;
import pageobjects.login.HomeLoginModePO;
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

    @Test(testName = "Transformations (WS)")
    public void seeMoreButtonOnTransformationPage() {
        Transformations transformations = mainGuest
                .goTransformations();
        SoftAssert softAssert = new SoftAssert();
        int before = Integer.MIN_VALUE;
        while(transformations.seeMore()) {
            int current = transformations.transformationsCount();
            softAssert = new OnixAssert(driver).softCheckFirstGreaterSecond(current, before, softAssert);
            System.out.println(before + "  " + current);
            before = current;
        }
        mainGuest = transformations.goMainGuest();
        softAssert.assertAll();
    }

    @Test(testName = "Blog (WS)")
    public void checkTotalNumberOfPostsOnAllBlogTabs() {
        Blog blog = mainGuest.goBlog();
        int total = blog.blogPO.countPosts();
        int fromEveryTab = 0;
        for(OnixLocator locator : BlogPO.Locator.values()) {
            driver.findElement(locator).click();
            fromEveryTab += blog.blogPO.countPosts();
        }
        fromEveryTab -= total;
        mainGuest = blog.goMainGuest();
        new OnixAssert(driver).checkCount(total, fromEveryTab);
    }

    @Test(testName = "Login (WS)")
    public void checkLoginPageFunctionality() {
        SoftAssert softAssert = new SoftAssert();
        HomeUser homeUser = mainGuest.login(User.getValidUser());
        softAssert = new OnixAssert(driver)
                .softCheckCountOfElementByLocator(HomeLoginModePO.Locator.MY_CABINET_DROPDOWN, 1, softAssert);
        mainGuest = homeUser.logout();
        ResetPasswordPO resetPasswordPO = mainGuest
                .goLoginPage()
                .clickForgotPassword();
        softAssert = new OnixAssert(driver)
                .softCheckCountOfElementByLocator(ResetPasswordPO.Locator.EMAIL_INPUT, 1, softAssert);
        mainGuest = new MainGuest(resetPasswordPO.goMainPage());
        homeUser = mainGuest.loginWithFB(User.getValidUser());
        softAssert = new OnixAssert(driver)
                .softCheckCountOfElementByLocator(HomeLoginModePO.Locator.MY_CABINET_DROPDOWN, 1, softAssert);
        mainGuest = homeUser.logout();
        JoinNowPO joinNowPO = mainGuest.goJoinNowPage();
        softAssert = new OnixAssert(driver)
                .softCheckCountOfElementByLocator(JoinNowPO.Locator.PRIVACY_POLICY_LINK, 1, softAssert);
        mainGuest = new MainGuest(joinNowPO.goMainPage());
        softAssert.assertAll();
    }


}
