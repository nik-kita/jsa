package locators;

import org.openqa.selenium.By;

public enum TransformationsPageLocator implements OnixLocator {
    SEE_MORE_BUTTON(By.cssSelector(".transformation_wr a"))

    ;

    private By path;

    TransformationsPageLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
