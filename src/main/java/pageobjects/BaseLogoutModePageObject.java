package pageobjects;

import engine.OnixWebDriver;
import pageobjects.locators.logout_mode.GeneralHeaderLogoutModeLocator;


public class BaseLogoutModePageObject extends BasePageObject implements GeneralHeaderLogoutModeLocator {
    public BaseLogoutModePageObject(OnixWebDriver driver) {
        super(driver);
    }

    @Override
    public BasePageObject goMainPage() {
        driver.findElement(HeaderLocator.JSA_LOGO).click();
        return new MainPO(driver);
    }

    public ChallengePO goChallengePage() {
        driver.findElement(HeaderLocator.CHALLENGE_HEADER_BUTTON).
                click();

        return new ChallengePO(driver);
    }

    @Override
    public PricingPO goPricingPage() {
        driver.findElement(HeaderLocator.PRICING_HEADER_BUTTON).
                click();
        return new PricingPO(driver);
    }

    public TransformationsPO goTransformationsPage() {
        driver.findElement(HeaderLocator.TRANSFORMATIONS_HEADER_BUTTON).
                click();
        return new TransformationsPO(driver);
    }





    public LoginPO goLoginPage() {
        driver.findElement(HeaderLocator.LOGIN_HEADER_BUTTON).click();
        return new LoginPO(driver);
    }

    public JoinNowPO goJoinNowPage() {
        driver.findElement(HeaderLocator.JOIN_NOW_HEADER_BUTTON).click();
        return new JoinNowPO(driver);
    }
}
