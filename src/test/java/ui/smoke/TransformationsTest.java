package ui.smoke;

import org.testng.annotations.BeforeClass;
import ui.OnixTestRunner;

public class TransformationsTest extends OnixTestRunner {
    @BeforeClass
    public void goTransformationsPage() {
        welcome().goTransformationsPage();
    }
}
