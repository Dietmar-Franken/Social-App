package com.tristanlarsin.socialapp;

/**
 * Created by tristanlarsin on 4/29/17.
 */

public class Presenter implements ModelViewPresenterComponents.SocialPresenterContract {

    // presenter needs to talk with his model
    private ModelViewPresenterComponents.Model iModel;
    private ModelViewPresenterComponents.View iView;

    public Presenter(ModelViewPresenterComponents.View socialView) {
        iView = socialView;
        iModel = new SocialModel(this);

    }

}