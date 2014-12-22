package com.it.fyp.runforlife;

import android.support.v4.app.Fragment;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Alan on 2014/11/22.
 */
public class Setting extends Fragment{

    private static Setting ourInstance = new Setting();

    public static Setting getInstance() {
        return ourInstance;
    }

    public Setting() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = null;
        rootView = inflater.inflate(R.layout.setting, container, false);

        TextView textVersion = (TextView) rootView.findViewById(R.id.textViewVersion);
        String versionName = "";
        try {
            PackageInfo pinfo = getActivity().getPackageManager ().getPackageInfo(getActivity().getPackageName(),0);
            versionName = pinfo.versionName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }

        textVersion.setText(textVersion.getText().toString()+versionName);

        return rootView;
    }
}
