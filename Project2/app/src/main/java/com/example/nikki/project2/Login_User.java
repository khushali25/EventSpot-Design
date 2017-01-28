package com.example.nikki.project2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import customerpack.Custnavigation;
import vendorpack.Frag_ServiceDetail;

public class Login_User extends AppCompatActivity {

    Button btnowner,btnvendor,btncustomer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__user);

        btncustomer=(Button)findViewById(R.id.cusomer1);
        btnowner=(Button)findViewById(R.id.owner1);
        btnvendor=(Button)findViewById(R.id.vendor1);

        btnowner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             /* Frag_OwnerDetail1 f1=new Frag_OwnerDetail1();
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.replace(R.id.content,f1);
                ft.commit(); */

                //Intent i=new Intent(Login_User.this,Frag_OwnerDetail1.class);
                //startActivity(i);
                Frag_OwnerDetail1 f1=new Frag_OwnerDetail1();
                android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(android.R.id.content,f1);
                fragmentTransaction.commit();
            }
        });

        btncustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Login_User.this,Custnavigation.class);
                startActivity(intent);
            }
        });

        btnvendor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Frag_ServiceDetail s1=new Frag_ServiceDetail();
                android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(android.R.id.content,s1);
                fragmentTransaction.commit();

            }
        });
    }
}
