package com.example.nikki.project2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_OwnerProfile extends Fragment {

    private RecyclerView recyclerView;
    private CardView cardView;
    private ArrayList<OwnerProfileDataModel> data;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    TextView ownerlogout;
    TextView ownerupdateprofile;
    TextView ownerchangepass;
    public Frag_OwnerProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag__ownerprofile,container,false);
        recyclerView = (RecyclerView)view.findViewById(R.id.my_recycler_view_ownerprofile);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ownerlogout=(TextView)view.findViewById(R.id.owner_logout);
        ownerupdateprofile=(TextView)view.findViewById(R.id.owner_updateprofile);
        ownerchangepass=(TextView)view.findViewById(R.id.owner_changepass);


        data = new ArrayList<OwnerProfileDataModel>();
        for (int i = 0; i < OwnerProfileMyData.nameArray.length; i++)
        {
            data.add(new OwnerProfileDataModel(
                    OwnerProfileMyData.nameArray[i],
                    OwnerProfileMyData.emailidArray[i],
                    OwnerProfileMyData.passwordArray[i],
                    OwnerProfileMyData.mobilenoArray[i],
                    OwnerProfileMyData.genderArray[i],
                    OwnerProfileMyData.addressArray[i],
                    OwnerProfileMyData.dobArray[i]

            ));
        }

        mAdapter = new OwnerProfileAdapter(data);
        recyclerView.setAdapter(mAdapter);

        ownerlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(),Login.class);
                startActivity(intent);
            }
        });

        ownerupdateprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),EditOwnerProfile.class);
                startActivity(intent);

            }
        });

        ownerchangepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Frag_ChangePass f1=new Frag_ChangePass();
                android.support.v4.app.FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.add(R.id.frcontent4,f1,"Frag_ChangePass");
                ft.addToBackStack("Frag_ChangePass");
                ft.commit();

            }
        });



        return view;
    }



}
