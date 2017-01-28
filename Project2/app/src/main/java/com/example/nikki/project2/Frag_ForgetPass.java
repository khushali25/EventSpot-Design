package com.example.nikki.project2;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_ForgetPass extends Fragment {

    EditText edt;
    Button b1;

    public Frag_ForgetPass() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_frag__forget_pass,null);
        edt=(EditText)view.findViewById(R.id.emailid);
        b1=(Button)view.findViewById(R.id.button1);


        final String regEx= "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1= edt.getText().toString();
                Matcher matcherObj = Pattern.compile(regEx).matcher(s1);

                if(matcherObj.matches())
                {
                    Toast.makeText(getActivity(),"New Password will be send on you Email id",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    edt.setError("Invalid Password");
                }

            }
        });



      return view;
    }

}
