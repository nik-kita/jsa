package locators;

import org.openqa.selenium.By;

public interface OnixLocator {
    By path = null;
    default By getPath() {
        return path;
    }
    String name();
}
