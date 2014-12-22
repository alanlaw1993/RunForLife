package com.it.fyp.runforlife;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alan on 2014/11/22.
 */
public class TrainingPlan extends Fragment{

    private static TrainingPlan ourInstance = new TrainingPlan();

    public static TrainingPlan getInstance() {
        return ourInstance;
    }

    public TrainingPlan() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = null;
        rootView = inflater.inflate(R.layout.trainingplan, container, false);


        return rootView;
    }
}
