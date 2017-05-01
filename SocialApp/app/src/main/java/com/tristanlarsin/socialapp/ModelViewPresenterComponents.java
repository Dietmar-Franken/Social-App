package com.tristanlarsin.socialapp;

import android.util.DisplayMetrics;

/**
 * Created by tristanlarsin on 4/29/17.
 */

public interface ModelViewPresenterComponents {

    interface View {
        DisplayMetrics getSizeOfScreen();
    }

    interface SocialPresenterContract {

    }

    interface Model {

    }

}
