package ui.wwwwwwwwwwwwwwww;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import shortcuts.RouteHacks;
import ui.OnixTestRunner;

public class RouteHacksTester extends OnixTestRunner {
    @BeforeClass
    public void openSite() {
        welcome();
    }

    @Test
    public void testQuickLogin() {
        new RouteHacks(driver).login();
    }
}
