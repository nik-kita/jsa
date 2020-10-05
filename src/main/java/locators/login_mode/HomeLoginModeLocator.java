package locators.login_mode;

import locators.OnixLocator;
import org.openqa.selenium.By;

public enum HomeLoginModeLocator implements OnixLocator {


    ;

    private By path;

    HomeLoginModeLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
