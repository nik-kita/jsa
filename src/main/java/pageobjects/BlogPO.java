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


    public OnixLocator POST = OnixLocator.makeOnixLocator(By.cssSelector(".post"));
    public OnixLocator LINK_IN_POST = OnixLocator.makeOnixLocator(By.cssSelector(".post div.post_descr a.title"));
    List<OnixLocator> elementsLocators = new ArrayList<>(List.of(
            POST, LINK_IN_POST
    ));


    public BlogPO clickRecentPosts() {
        driver.findElement(Locator.RECENT_POSTS).click();
        return this;
    }

    public BlogPO clickOnlineFitness() {
        driver.findElement(Locator.ONLINE_FITNESS).click();
        return this;
    }

    public BlogPO clickNews() {
        driver.findElement(Locator.NEWS).click();
        return this;
    }

    public BlogPO clickThinking() {
        driver.findElement(Locator.THINKING).click();
        return this;
    }

    public BlogPO clickFeedback() {
        driver.findElement(Locator.FEEDBACK).click();
        return this;
    }

    public int countPosts() {
        driver.scrollPageDown();
        int result =  driver.findElements(POST).size();
        driver.scrollPageUp();
        return result;
    }


    public enum Locator implements OnixLocator {
        RECENT_POSTS(By.xpath("//span[contains(text(), 'Recent posts')]")),
        ONLINE_FITNESS(By.xpath("//span[contains(text(), 'Online Fitness')]")),
        NEWS(By.xpath("//span[contains(text(), 'News')]")),
        TRAINING(By.xpath("//span[contains(text(), 'Training')]")),
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
