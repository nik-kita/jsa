package business_logic;

import business_logic.login.MainUser;
import engine.OnixWebDriver;
import org.sonatype.guice.bean.containers.Main;
import pageobjects.BlogPO;
import pageobjects.MainPO;
import pageobjects.login.MainLoginModePO;

public class Blog {
    public BlogPO blogPO;
    public Blog(BlogPO blogPO) {
        this.blogPO = blogPO;
    }

    public MainGuest goMainGuest() {
        MainPO mainPO = blogPO.goMainPage();
        return new MainGuest(mainPO);
    }

    public MainUser goMainUser() {
        OnixWebDriver driver = blogPO.getDriver();
        blogPO.goMainPage();
        return new MainUser(new MainLoginModePO(driver));
    }
}
