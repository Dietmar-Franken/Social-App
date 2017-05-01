package com.tristanlarsin.socialapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by tristanlarsin on 5/1/17.
 */

public class ProfileFragment extends Fragment {

    ImageView large_profile, pic1, pic2, pic3, pic4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile, container, false);



        large_profile = (ImageView) view.findViewById(R.id.profile_pic);

        pic1 = (ImageView) view.findViewById(R.id.pic1);

        pic2 = (ImageView) view.findViewById(R.id.pic2);

        pic3 = (ImageView) view.findViewById(R.id.pic3);

        pic4 = (ImageView) view.findViewById(R.id.pic4);


        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onResume() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        sizeItems(displayMetrics);

        super.onResume();
    }

    public void sizeItems(DisplayMetrics displayMetrics) {
        large_profile.setMinimumWidth((int) (displayMetrics.widthPixels * .9));
    }
}
