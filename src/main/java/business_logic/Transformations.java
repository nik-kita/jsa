package business_logic;

import pageobjects.TransformationsPO;

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
}
