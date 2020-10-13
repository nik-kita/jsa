package pageobjects;

import engine.OnixWebDriver;
import locators.GeneralHeaderLocator;


public class BaseLogoutModePageObject extends BasePageObject {
    public BaseLogoutModePageObject(OnixWebDriver driver) {
        super(driver);
    }

    @Override
    public BasePageObject goMainPage() {
        driver.findElement(GeneralHeaderLocator.JSA_LOGO).click();
        return new MainPO(driver);
    }

    public ChallengePO goChallengePage() {
        driver.findElement(GeneralHeaderLocator.CHALLENGE_HEADER_BUTTON).
                click();

        return new ChallengePO(driver);
    }

    @Override
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





    public LoginPO goLoginPage() {
        driver.findElement(GeneralHeaderLocator.LOGIN_HEADER_BUTTON).click();
        return new LoginPO(driver);
    }

    public JoinNowPO goJoinNowPage() {
        driver.findElement(GeneralHeaderLocator.JOIN_NOW_HEADER_BUTTON).click();
        return new JoinNowPO(driver);
    }
}