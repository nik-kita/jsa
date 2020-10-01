package locators;

import org.openqa.selenium.By;

public enum MainHeaderLocator implements Locator {
    JSA_LOGO(By.cssSelector("a[href='/'] img")),


    ;

    private By path;

    MainHeaderLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
