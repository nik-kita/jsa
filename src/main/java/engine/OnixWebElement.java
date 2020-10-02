package engine;

import org.openqa.selenium.WebElement;

public class OnixWebElement {
    private WebElement element;

    public OnixWebElement(WebElement element) {
        this.element = element;
    }

    public void click() {
        element.click();
    }
}
