package com.it.fyp.runforlife;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by User on 17/11/2014.
 */
public class LoginPage  extends Fragment{
    private static LoginPage ourInstance = new LoginPage();

    public static LoginPage getInstance() {
        return ourInstance;
    }

    public LoginPage() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = null;
        rootView = inflater.inflate(R.layout.login, container, false);


        Button buttonLogin = (Button) rootView.findViewById(R.id.buttonLogin);
        final EditText editName = (EditText) rootView.findViewById(R.id.editUersName);
        final EditText editPassword = (EditText) rootView.findViewById(R.id.editUserPassword);
        buttonLogin.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "hihihi" + editName.getText().toString() +
                        "  " + editPassword.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });

        return rootView;
    }
}
