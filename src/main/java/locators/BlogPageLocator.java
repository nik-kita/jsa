package locators;

import org.openqa.selenium.By;

public enum BlogPageLocator implements OnixLocator {
    RECENT_POSTS_LINK(By.xpath("//span[contains(text(), 'posts')]")),
    ONLINE_FITNESS_LINK(By.xpath("//span[contains(text(), 'Fitness')]")),
    NEWS_LINK(By.xpath("//span[contains(text(), 'News')]")),
    THINKING_LINK(By.xpath("//span[contains(text(), 'Thinking')]")),
    TRAINING_LINK(By.xpath("//span[contains(text(), 'Training')]")),
    FEEDBACK_LINK(By.xpath("//span[contains(text(), 'Feedback')]")),
    ;

    private By path;

    BlogPageLocator(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
