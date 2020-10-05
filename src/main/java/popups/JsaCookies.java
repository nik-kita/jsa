package popups;

import engine.OnixWebDriver;
import locators.PopupsLocators;

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
}
