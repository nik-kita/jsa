package pageobjects;

import engine.OnixWebDriver;
import org.openqa.selenium.By;
import pageobjects.general_parts.OnixLocator;

import java.util.ArrayList;
import java.util.List;

public class BlogPO extends BaseLogoutModePageObject {
    public BlogPO(OnixWebDriver driver) {
        super(driver);
    }

    public OnixBox post = new OnixBox() {
        OnixLocator POST = OnixLocator.makeOnixLocator(By.cssSelector(".post"));
        OnixLocator LINK_IN_POST = OnixLocator.makeOnixLocator(By.cssSelector(".post div.post_descr a.title"));
        {
            allLocators = new ArrayList<>(List.of(
                    POST, LINK_IN_POST
            ));
        }
    };




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
