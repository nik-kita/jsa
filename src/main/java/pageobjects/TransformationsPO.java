package pageobjects;

import engine.OnixWebDriver;
import pageobjects.general_parts.OnixLocator;
import org.openqa.selenium.By;

public class TransformationsPO extends BaseLogoutModePageObject {
    public TransformationsPO(OnixWebDriver driver) {
        super(driver);
    }

    public OnixLocator TRANSFORMATION_BLOCK = OnixLocator
            .makeOnixLocator(By
                    .xpath("//div[@class='masonry-grid']//div[contains(@class, 'masonry-block')][contains(@style, 'display: block')]"));

    public TransformationsPO clickSeeMoreButton() {
        driver.scrollPageDown();
        driver.findElement(Locator.SEE_MORE_BUTTON).click();
        return new TransformationsPO(driver);
    }

    public int countTransformations() {
        return driver.findElements(TRANSFORMATION_BLOCK).size();
    }

    public boolean isSeeMoreButtonPresent() {
        return driver
                .findElement(Locator.SEE_MORE_BUTTON)
                .getSeleniumWebElement().isDisplayed();
    }

    public enum Locator implements OnixLocator {
        SEE_MORE_BUTTON(By.cssSelector(".transformation_wr a")),
        HIDDEN_SEE_MORE_BUTTON(By.xpath("//*[@class='transformation_wr']//a[@style='display: none;']"))

        ;

        private By path;

        Locator(By path) {
            this.path = path;
        }

        @Override
        public By getPath() {
            return path;
        }
    }



}
