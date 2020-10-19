package pageobjects.login;

import engine.OnixWebDriver;
import pageobjects.MainPO;
import pageobjects.general_parts.OnixLocator;
import org.openqa.selenium.By;

public class UserCabinetDropdownPO extends BaseLoginModePageObject {
    public UserCabinetDropdownPO(OnixWebDriver driver) {
        super(driver);
    }

    public MainPO logout() {
        driver.findElement(Locator.LOG_OUT).click();
        driver.findElement(HeaderLocator.JSA_LOGO).click();
        return new MainPO(driver);
    }



    public enum Locator implements OnixLocator {
        ACCOUNT(By.cssSelector(".dropdown-menu [href='/users/account']")),
        PRICING(By.cssSelector(".dropdown-menu [href='/users/pricing/']")),
        FAQs(By.xpath("//a[contains(text(), 'FAQs')]")),
        LOG_OUT(By.cssSelector("[href='/accounts/logout']"));

        private By path;

        Locator(By path) {
            this.path = path;
        }
        @Override
        public By getPath() {
            return path;
        }

    }
}
