package pageobjects;

import locators.GeneralHeaderLocator;
import engine.OnixWebDriver;
import pageobjects.blog.BlogPO;

public class HomePO extends BasePageObject {
    public HomePO(OnixWebDriver driver) {
        super(driver);
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
}
