package pageobjects;

import locators.GeneralHeaderLocator;
import engine.OnixWebDriver;
import locators.JoinNowPageLocator;
import locators.LoginPageLocator;
import pageobjects.blog.BlogPO;
import popups.JsaCookies;

public class MainPO extends BaseLogoutModePageObject {
    public MainPO(OnixWebDriver driver) {
        super(driver);
        JsaCookies.acceptIfCookiesPresent(driver);
    }

    public ChallengePO goChallengePage() {
        driver.findElement(GeneralHeaderLocator.CHALLENGE_HEADER_BUTTON).
                click();

        return new ChallengePO(driver);
    }

    public PricingPO goPricingPage() {
        driver.findElement(GeneralHeaderLocator.PRICING_HEADER_BUTTON).
                click();
        return new PricingPO(driver);
    }

    public TransformationsPO goTransformationsPage() {
        driver.findElement(GeneralHeaderLocator.TRANSFORMATIONS_HEADER_BUTTON).
                click();
        return new TransformationsPO(driver);
    }

    public MyBookPO goMyBookPage() {
        driver.findElement(GeneralHeaderLocator.BOOK_LOGO).
                click();
        return new MyBookPO(driver);
    }

    public BlogPO goBlogPage() {
        driver.findElement(GeneralHeaderLocator.BLOG_HEADER_BUTTON).click();
        return new BlogPO(driver);
    }

    public LoginPO goLoginPage() {
        driver.findElement(GeneralHeaderLocator.LOGIN_HEADER_BUTTON).click();
        return new LoginPO(driver);
    }

    public JoinNowPO goJoinNowPage() {
        driver.findElement(GeneralHeaderLocator.JOIN_NOW_HEADER_BUTTON).click();
        return new JoinNowPO(driver);
    }
}
