package locators;

import org.openqa.selenium.By;

public enum HomeLocator implements Locator {
    JSA_LOGO(By.cssSelector("a[href='/'] img")),


    ;

    private By path;

    HomeLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
