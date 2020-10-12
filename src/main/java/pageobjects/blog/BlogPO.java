package pageobjects.blog;

import engine.OnixWebDriver;
import locators.OnixLocator;
import org.openqa.selenium.By;
import pageobjects.BaseLogoutModePageObject;

public class BlogPO extends BaseLogoutModePageObject {
    public BlogPO(OnixWebDriver driver) {
        super(driver);
    }

    public enum Locator implements OnixLocator {
        RECENT_POSTS_LINK(By.xpath("//a[contains(text(), 'blog')]")),
        ONLINE_FITNESS_LINK(By.cssSelector("a[href='/blog/category/online-fitness.html']")),
        NEWS_LINK(By.xpath("//span[contains(text(), 'News')]")),
        THINKING_LINK(By.xpath("//span[contains(text(), 'Thinking')]")),
        TRAINING_LINK(By.xpath("//span[contains(text(), 'Training')]")),
        FEEDBACK_LINK(By.xpath("//span[contains(text(), 'Feedback')]")),
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
