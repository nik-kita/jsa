package locators;

import org.openqa.selenium.By;

public enum Transformations implements OnixLocator {
    SEE_MORE_BUTTON(By.cssSelector(".tarnsformation_wr a"))

    ;

    private By path;

    Transformations(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
