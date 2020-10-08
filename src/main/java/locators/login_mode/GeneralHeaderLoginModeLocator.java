package locators.login_mode;

import locators.OnixLocator;
import org.openqa.selenium.By;

public enum GeneralHeaderLoginModeLocator implements OnixLocator {

    ;

    private By path;

    GeneralHeaderLoginModeLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }


}
