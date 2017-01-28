package com.example.nikki.project2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Registration_User extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration__user);

        Frag_RegUser f1=new Frag_RegUser();
        android.app.FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.frcontent2,f1,"Frag_RegUser");
      //  ft.addToBackStack("Frag_RegUser");
        ft.commit();

    }
}
