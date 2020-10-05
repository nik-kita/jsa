package locators;

import org.openqa.selenium.By;

public class PopupsLocators {

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
