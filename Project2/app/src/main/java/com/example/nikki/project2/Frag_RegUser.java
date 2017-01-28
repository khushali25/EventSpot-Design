package com.example.nikki.project2;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import customerpack.Frag_custreg;
import vendorpack.Frag_vendorreg;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_RegUser extends Fragment {


    Button btnowner,btnvendor,btncustomer;


    public Frag_RegUser() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag__reg_user, container, false);

        btnowner=(Button)view.findViewById(R.id.owner);
        btnvendor=(Button)view.findViewById(R.id.vendor);
        btncustomer=(Button)view.findViewById(R.id.cusomer);

        btnowner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Frag_OwnerReg fo=new Frag_OwnerReg();
                android.app.FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.activity_registration__user,fo,"Frag_OwnerReg");
                fragmentTransaction.addToBackStack("Frag_OwnerReg");
                fragmentTransaction.commit();

            }
        });


        btncustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Frag_custreg fc=new Frag_custreg();
                android.app.FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.activity_registration__user,fc,"Frag_custreg");
                fragmentTransaction.addToBackStack("Frag_custreg");
                fragmentTransaction.commit();


            }
        });

        btnvendor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Frag_vendorreg fv=new Frag_vendorreg();
                android.app.FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.activity_registration__user,fv,"Frag_vendorreg");
                fragmentTransaction.addToBackStack("Frag_vendorreg");
                fragmentTransaction.commit();


            }
        });




        return view;
    }

}
