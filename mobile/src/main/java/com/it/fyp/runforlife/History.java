package com.it.fyp.runforlife;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alan on 2014/11/22.
 */
public class History extends Fragment{
    private static History ourInstance = new History();

    public static History getInstance() {
        return ourInstance;
    }

    public History() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = null;
        rootView = inflater.inflate(R.layout.history, container, false);


        return rootView;
    }


}
