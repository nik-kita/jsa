package popups;

import engine.OnixWebDriver;
import locators.OnixLocator;
import org.openqa.selenium.By;

public class JsaCookies {
    OnixWebDriver driver;

    public JsaCookies(OnixWebDriver driver) {
        this.driver = driver;
    }

    public static void acceptIfCookiesPresent(OnixWebDriver driver) {
        if(!driver.checkSetting("jsacookies")) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (driver.findElements(PopupsLocators.JsaCookiesLocator.DIALOG_BODY).size() > 0) {
                driver.findElement(PopupsLocators.JsaCookiesLocator.OK_BUTTON).click();
                driver.setSetting("jsacookies", true);
            }
        }

    }
    public enum JsaCookiesLocator implements OnixLocator {
        DIALOG_BODY(By.cssSelector("#CybotCookiebotDialog")),
        OK_BUTTON(By.cssSelector("#CybotCookiebotDialogBodyLevelButtonAccept")),

        ;
        private By path;

        JsaCookiesLocator(By path) {
            this.path = path;
        }

        @Override
        public By getPath() {
            return path;
        }
    }

}
