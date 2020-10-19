package pageobjects;

import engine.OnixWebDriver;
import org.openqa.selenium.By;
import pageobjects.general_parts.OnixLocator;

public class BlogPO extends BaseLogoutModePageObject {
    public BlogPO(OnixWebDriver driver) {
        super(driver);
    }

    public enum Locator implements OnixLocator {
        RECENT_POSTS(By.xpath("//span[contains(text(), 'Recent posts')]")),
        ONLINE_FITNESS(By.xpath("//span[contains(text(), 'Online Fitness')]")),
        NEWS(By.xpath("//span[contains(text(), 'News')]")),
        THINKING(By.xpath("//span[contains(text(), 'Thinking')]")),
        FEEDBACK(By.xpath("//span[contains(text(), 'Feedback')]")),

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
