package com.example.nikki.project2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_ChangePass extends Fragment {

    EditText e1,e2,e3;
    Button b1;


    public Frag_ChangePass() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_frag__change_pass,null);

        e1=(EditText)view.findViewById(R.id.emailid1);
        e2=(EditText)view.findViewById(R.id.tpass);
        e3=(EditText)view.findViewById(R.id.tpass1);
        b1=(Button)view.findViewById(R.id.ChangePass);

        final String regEx= "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3= e3.getText().toString();
                Matcher matcherObj = Pattern.compile(regEx).matcher(s1);

                if(!matcherObj.matches())
                {
                    e1.setError("Invalid Email id");
                }
                else if(s1.length()==0 && s2.length()==0 && s3.length()==0 )
                {
                    e1.setError("Enter Email id");
                    e2.setError("Enter Current password");
                    e3.setError("Enter New Password");
                }
                else if(s1.length()==0)
                {
                    e1.setError("Enter Email id");

                }
                else if(s2.length()==0)
                {
                    e2.setError("Enter Current password");

                }
                else if(s3.length()==0)
                {
                    e3.setError("Enter New Password");

                }




            }
        });


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag__change_pass, container, false);
    }

}
