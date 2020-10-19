package business_logic;

import business_logic.login.MainUser;
import engine.OnixWebDriver;
import pageobjects.MainPO;
import pageobjects.TransformationsPO;
import pageobjects.login.MainLoginModePO;

public class Transformations {
    TransformationsPO transformationsPO;
    public Transformations(TransformationsPO transformationsPO) {
        this.transformationsPO = transformationsPO;
    }

    public boolean seeMore() {
        if(transformationsPO.isSeeMoreButtonPresent()) {
            transformationsPO.clickSeeMoreButton();
            return true;
        }
        return false;
    }

    public int transformationsCount() {
        return transformationsPO.countTransformations();
    }

    public MainUser goMainUser() {
        OnixWebDriver driver = transformationsPO.getDriver();
        transformationsPO.goMainPage();
        return new MainUser(new MainLoginModePO(driver));
    }

    public MainGuest goMainGuest() {
        OnixWebDriver driver = transformationsPO.getDriver();
        transformationsPO.goMainPage();
        return new MainGuest(new MainPO(driver));
    }
}
