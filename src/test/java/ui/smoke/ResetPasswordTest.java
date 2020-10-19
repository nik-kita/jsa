package ui.smoke;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.ResetPasswordPO;
import pageobjects.general_parts.GeneralFooter;
import pageobjects.general_parts.OnixLocator;
import pageobjects.general_parts.logout_mode.GeneralHeaderLogoutModeLocator;
import ui.OnixAssert;
import ui.OnixTestRunner;

public class ResetPasswordTest extends OnixTestRunner {
    ResetPasswordPO resetPasswordPO;
    @BeforeClass
    public void goResetPasswordPage() {
        resetPasswordPO = openSite().goLoginPage().clickForgotPassword();
    }

    @Test(dataProvider = "getResetPasswordLocators")
    public void resetPasswordPageTest(OnixLocator locator) {
        new OnixAssert(driver).checkCountOfElementByLocator(locator, 1);
    }
    @DataProvider
    public Object[] getResetPasswordLocators() {
        return mergeArrays(
                GeneralFooter.FooterLocator.values(),
                GeneralHeaderLogoutModeLocator.HeaderLocator.values(),
                ResetPasswordPO.Locator.values()
        );
    }
}
