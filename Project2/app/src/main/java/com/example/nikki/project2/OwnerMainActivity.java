package com.example.nikki.project2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class OwnerMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_main);

        Frag_OwnerDetail1 fo=new Frag_OwnerDetail1();
        android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frcontent4,fo);
        ft.commit();

    }

   /* @Override
    public void onBackPressed() {
        //  super.onBackPressed();
        Frag_EditOwnerProfile myFragment = (Frag_EditOwnerProfile)getSupportFragmentManager().findFragmentByTag("Frag_EditOwnerProfile");
        if (myFragment != null && myFragment.isVisible()) {
            // add your code here
        }
    } */
}
