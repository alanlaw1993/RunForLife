package com.it.fyp.runforlife;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alan on 2014/11/22.
 */
public class Shopping extends Fragment{

    private static Shopping ourInstance = new Shopping();

    public static Shopping getInstance() {
        return ourInstance;
    }

    public Shopping() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = null;
        rootView = inflater.inflate(R.layout.shopping, container, false);


        return rootView;
    }
}
