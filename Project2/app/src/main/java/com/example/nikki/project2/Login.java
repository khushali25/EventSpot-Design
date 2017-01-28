package com.example.nikki.project2;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import customerpack.Custnavigation;
import vendorpack.ServiceMainActivity;

public class Login extends AppCompatActivity {


    Button b1;
    EditText e1,e2;
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = (Button) findViewById(R.id.button1);
        e1 = (EditText) findViewById(R.id.username);
        e2 = (EditText) findViewById(R.id.pass);
        t1 = (TextView) findViewById(R.id.forgetpass);

        t3=(TextView)findViewById(R.id.reg);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();


               if (s1.equals("a") && s2.equals("b"))
               {
                   Intent intent=new Intent(Login.this, Custnavigation.class);
                   startActivity(intent);


                }
               else if (s1.equals("c") && s2.equals("d"))
                {
                    Intent intent=new Intent(Login.this, ServiceMainActivity.class);
                    startActivity(intent);




                } else {
                   Intent intent=new Intent(Login.this, OwnerMainActivity.class);
                   startActivity(intent);
                   //finish();


                }

            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Frag_ForgetPass f1=new Frag_ForgetPass();
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.add(android.R.id.content,f1,"Frag_ForgetPass");
                ft.addToBackStack("Frag_ForgetPass");
                ft.commit();


            }
        });



        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Login.this,Registration_User.class);
                startActivity(intent);


            }
        });




    }


    }


