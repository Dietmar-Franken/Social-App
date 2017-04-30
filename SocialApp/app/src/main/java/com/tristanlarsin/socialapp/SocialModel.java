package com.tristanlarsin.socialapp;

/**
 * Created by tristanlarsin on 4/29/17.
 */

public class SocialModel implements ModelViewPresenterComponents.Model {

    private ModelViewPresenterComponents.SocialPresenterContract presenter;

    public SocialModel(ModelViewPresenterComponents.SocialPresenterContract  presenter) {
        this.presenter = presenter;
    }
}
